package com.example.demo.models;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name= "sale")
public class SaleModel {
    @Id
    @Column(nullable = false, unique = true )
    private int id;
    private ArrayList<ProductModel> products;
    private Double price;
    private Date date;
    public Date getDate() {
        return date;
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
    public void setDate(Date date) {
        this.date = date;
    }    
}
