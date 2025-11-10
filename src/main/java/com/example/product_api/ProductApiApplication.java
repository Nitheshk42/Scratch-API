package com.example.product_api;

import com.example.product_api.model.Product;
import com.example.product_api.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabse(ProductRepository repository) {
        return args -> {
            repository.save(new Product("Apple iphone", 799.99));
            repository.save(new Product("Samsung", 699.99));
            repository.save(new Product("Google", 599.99));
        };
    }
}