package io.kronstadt.lab.tank.po;

import io.kronstadt.lab.tank.message.OrderProto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String symbol;
    private double price;
    private double quantity;
    private OrderProto.Order.Side side;
}
