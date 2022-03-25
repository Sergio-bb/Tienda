package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.ProductModel;
import com.example.demo.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Products/")
public class ProductController {

    @Autowired
    private ProductService _productService;

    @GetMapping("GetAll")
    public List<ProductModel> getAll(){   
        return _productService.getProducts();
    }
    @PostMapping("Add")
    public ProductModel add(ProductModel product){
        if(product != null){
            return _productService.add(product);
        }else{
            return null;
        }
    }
    @PostMapping("Delete")
    public String Delete(Integer id){
        
        Boolean isSuccessful = _productService.delete(id);
    }
}
