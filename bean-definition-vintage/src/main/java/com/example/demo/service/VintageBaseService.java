package com.example.demo.service;

import com.example.demo.repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VintageBaseService {


    @Autowired
    LoyaltyPointsRepository loyaltyPointsRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    WareHouseRepository wareHouseRepository;

    @Autowired
    WishListRepository wishListRepository;

    @Autowired
    GreetingsService greetingsService;

    @PostConstruct
    public void init() {
        wishListRepository.toString();
        wareHouseRepository.toString();
        userRepository.toString();
        productsRepository.toString();
        orderRepository.toString();
        loyaltyPointsRepository.toString();
    }
}
