package io.kronstadt.lab.tank.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.kronstadt.lab.tank.message.OrderProto;
import io.kronstadt.lab.tank.po.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.Charset;

@RestController
@RequestMapping("/test")
@Slf4j
public class MessageController {
    @Autowired
    public KafkaTemplate<String, byte[]> kafkaTemplate;
    @Autowired
    public ObjectMapper objectMapper;

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder() throws IOException {
        // Protobuf 序列化
        byte[] protobuf=null;
        long begin=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            protobuf=OrderProto.Order.newBuilder()
                    .setPrice(19.8)
                    .setQuantity(982)
                    .setSymbol("btcusdt")
                    .setSide(OrderProto.Order.Side.ASK)
                    .build().toByteArray();
        }
        long end=System.currentTimeMillis();
        log.info("[Protobuf encode] duration time:"+(end-begin)+"\tlength:"+protobuf.length);
        this.kafkaTemplate.send("order-protobuf", "btcusdt", protobuf);

        // Json 序列化
        byte[] json = null;
        begin=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            json=this.objectMapper.writeValueAsBytes(Order.builder()
                    .price(19.8)
                    .quantity(982)
                    .symbol("btcusdt")
                    .side(OrderProto.Order.Side.ASK)
                    .build());
        }
        end=System.currentTimeMillis();
        log.info("[JSON encode] duration time:"+(end-begin)+"\tlength:"+json.length);
        this.kafkaTemplate.send("order-json", "btcusdt", json);
    }
}
