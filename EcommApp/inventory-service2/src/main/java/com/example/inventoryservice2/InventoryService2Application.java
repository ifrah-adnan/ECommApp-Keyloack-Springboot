package com.example.inventoryservice2;

import com.example.inventoryservice2.entities.Products;
import com.example.inventoryservice2.repositories.ProductRespositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@SpringBootApplication
public class InventoryService2Application {

    public static void main(String[] args) {
        SpringApplication.run(InventoryService2Application.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(ProductRespositories productRespositories){
        return args -> {
            productRespositories.save(Products.builder().id(UUID.randomUUID().toString()).name("Computer").price(2400).quantity(2).build());
            productRespositories.save(Products.builder().id(UUID.randomUUID().toString()).name("Printer").price(1000).quantity(30).build());
            productRespositories.save(Products.builder().id(UUID.randomUUID().toString()).name("Smart Phone").price(6000).quantity(42).build());

        };
}
}
