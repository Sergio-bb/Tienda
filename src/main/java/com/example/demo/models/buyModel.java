package com.example.demo.models;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name= "buy")
public class BuyModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;
    private Date Date;
    private ArrayList<ProductModel> products;
    private Double price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate() {
        return Date;
    }
    public void setDate(Date date) {
        Date = date;
    }
    public ArrayList<ProductModel> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<ProductModel> products) {
        this.products = products;
    }
    public Double getPrice() {
        return products.stream()
        .mapToDouble(o -> o.getPriceSale())
        .sum();
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}