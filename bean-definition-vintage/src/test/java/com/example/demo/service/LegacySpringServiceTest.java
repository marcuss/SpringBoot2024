package com.example.demo.service;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

import com.example.demo.repository.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class LegacySpringServiceTest {

    @MockBean
    private LoyaltyPointsRepository loyaltyPointsRepository;
    @MockBean
    private OrderRepository orderRepository;
    @MockBean
    private ProductsRepository productsRepository;
    @MockBean
    private UserRepository userRepository;
    @MockBean
    private WareHouseRepository wareHouseRepository;
    @MockBean
    private WishListRepository wishListRepository;
    @MockBean
    private GreetingsService greetingsService;

    @InjectMocks
    private LegacySpringService legacySpringService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRun() {
        String expectedGreeting = "Hello, World!";
        when(greetingsService.greet()).thenReturn(expectedGreeting);

        // Execute the run method
        legacySpringService.run();

        // Verify interactions
        verify(greetingsService, times(1)).greet();

        // You can also assert the output if needed
        assertEquals(expectedGreeting, greetingsService.greet());
    }

    @Test
    public void testRunSuccess() {
        String expectedGreeting = "Hello, World!";
        when(greetingsService.greet()).thenReturn(expectedGreeting);

        // Execute the run method
        legacySpringService.run();

        // Verify interactions
        verify(greetingsService, times(1)).greet();

        // You can also assert the output if needed
        assertEquals(expectedGreeting, greetingsService.greet());
    }
}