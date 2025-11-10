package com.example.product_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private double price;

    //Constructor
    public Product() {}

    public Product(String name, double price) {
        this.name=name;
        this.price=price;
    }

    //Getter and Setters
    public Long getId() {return id; }
    public void setId(Long id) { this.id= id; }

    public String getName() { return name; }
    public void SetName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void SetPrice(double price) { this.price= price; }

}
