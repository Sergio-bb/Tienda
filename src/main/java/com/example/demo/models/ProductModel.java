package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class ProductModel {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true, nullable = false)
   private int id;
   private String code;
   private String name;
   private Double priceBuy;
   private Double priceSale;
   private String description;
   private Double amount;

    public Double getPriceSale() {
        return priceSale;
    }
    public void setPriceSale(Double priceSale) {
        this.priceSale = priceSale;
    }
    public int getId() {
        return id;
    }
    public Double getpriceBuy() {
        return priceBuy;
    }
    public void setpriceBuy(Double priceBuy) {
        this.priceBuy = priceBuy;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
