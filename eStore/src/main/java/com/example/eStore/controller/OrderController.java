package com.example.eStore.controller;

import com.example.eStore.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    @PostMapping
    public void createOrder(@RequestBody Order order){}

    @GetMapping
    public List<Order> getOrder(){return null;}

    @GetMapping("/{orderId}")
    public List<Order> getOrder(@PathVariable("orderId") Long orderId){
        return null;
    }

    @DeleteMapping("/{userId}")
    public  void deleteOrder(@PathVariable("orderId")Long orderId){

    }

    @PutMapping
    public  void updateOrder(@RequestBody Order order)
    {

    }

}
