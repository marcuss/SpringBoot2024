package org.example.service;

import jakarta.annotation.PostConstruct;
import org.example.repository.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VintageBaseService {

    private final LoyaltyPointsRepository loyaltyPointsRepository;
    private final OrderRepository orderRepository;
    private final ProductsRepository productsRepository;
    private final UserRepository userRepository;
    private final WareHouseRepository wareHouseRepository;
    private final WishListRepository wishListRepository;
    private final GreetingsService greetingsService;

    public VintageBaseService(LoyaltyPointsRepository loyaltyPointsRepository,
                              OrderRepository orderRepository,
                              ProductsRepository productsRepository,
                              UserRepository userRepository,
                              WareHouseRepository wareHouseRepository,
                              WishListRepository wishListRepository,
                              @Qualifier("defaultGreeter")
                              GreetingsService greetingsService) {
        this.loyaltyPointsRepository = loyaltyPointsRepository;
        this.orderRepository = orderRepository;
        this.productsRepository = productsRepository;
        this.userRepository = userRepository;
        this.wareHouseRepository = wareHouseRepository;
        this.wishListRepository = wishListRepository;
        this.greetingsService = greetingsService;
    }

    @PostConstruct
    public void init() {
        wishListRepository.toString();
        wareHouseRepository.toString();
        userRepository.toString();
        productsRepository.toString();
        orderRepository.toString();
        loyaltyPointsRepository.toString();
    }

    public LoyaltyPointsRepository getLoyaltyPointsRepository() {
        return loyaltyPointsRepository;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public ProductsRepository getProductsRepository() {
        return productsRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public WareHouseRepository getWareHouseRepository() {
        return wareHouseRepository;
    }

    public WishListRepository getWishListRepository() {
        return wishListRepository;
    }

    public GreetingsService getGreetingsService() {
        return greetingsService;
    }

}
