package com.shawn.order_service.Service;

import com.shawn.order_service.Clients.ProductClient;
import com.shawn.order_service.DTO.ProductDTO;
import com.shawn.order_service.Entity.Order;
import com.shawn.order_service.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order addOrder(Order order) {
        ProductDTO product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
