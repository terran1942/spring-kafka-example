package io.kronstadt.lab.tank.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.kronstadt.lab.tank.message.OrderProto;
import io.kronstadt.lab.tank.po.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class MessageListener {
    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = {"order-protobuf"})
    public void receiveProtobufOrderMessage(@Header(KafkaHeaders.OFFSET) long offset,
                                          @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                                          @Header(KafkaHeaders.RECEIVED_PARTITION_ID) Integer partition,
                                          @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                                          @Payload byte[] message) throws IOException {
        long begin=System.currentTimeMillis();
        OrderProto.Order order = null;
        for (int i = 0; i < 100000; i++) {
            order=OrderProto.Order.parseFrom(message);
        }
        long end=System.currentTimeMillis();
        log.info("[Protobuf decode] duration time:"+(end-begin));
        log.info("[Listener] protobuf order="+order);
    }

    @KafkaListener(topics = {"order-json"})
    public void receiveJsonOrderMessage(@Header(KafkaHeaders.OFFSET) long offset,
                                          @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                                          @Header(KafkaHeaders.RECEIVED_PARTITION_ID) Integer partition,
                                          @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                                          @Payload byte[] message) throws IOException {
        // Json 反序列化
        long begin=System.currentTimeMillis();
        Order order=null;
        for (int i = 0; i < 100000; i++) {
            order=this.objectMapper.readValue(message, Order.class);
        }
        long end=System.currentTimeMillis();

        log.info("[JSON decode] duration time:"+(end-begin));
        log.info("[Listener] json order="+order);
    }
}
