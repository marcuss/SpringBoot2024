package org.example.service;

import jakarta.inject.Named;
import org.example.repository.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LegacySpringService extends VintageBaseService implements CommandLineRunner {


    public LegacySpringService(LoyaltyPointsRepository loyaltyPointsRepository,
                               OrderRepository orderRepository,
                               ProductsRepository productsRepository,
                               UserRepository userRepository,
                               WareHouseRepository wareHouseRepository,
                               WishListRepository wishListRepository,
                               @Named("defaultGreeter")
                               GreetingsService greetingsService) {
        super(loyaltyPointsRepository, orderRepository, productsRepository, userRepository, wareHouseRepository, wishListRepository, greetingsService);
    }

    @Override
    public void run(String... args) {
        System.out.println(getGreetingsService().greet());
    }
}

