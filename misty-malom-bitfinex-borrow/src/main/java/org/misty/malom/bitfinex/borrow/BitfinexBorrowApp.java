package org.misty.malom.bitfinex.borrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BitfinexBorrowApp {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext application = SpringApplication.run(BitfinexBorrowApp.class, args)) {
        }
    }

}
