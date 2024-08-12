package com.shawn.order_service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private String id;
    private String productId;
    private int quantity;
}
