package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ProductModel;
import com.example.demo.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired 
    private ProductRepository _productRepository;

    public ArrayList<ProductModel> getProducts(){
        return (ArrayList<ProductModel>)_productRepository.findAll();
    }

    public Optional<ProductModel> getById(Integer id){
        return _productRepository.findById(id);
    }
    public ProductModel add(ProductModel entity){
        return _productRepository.save(entity);
    }
    public Boolean delete(int id){
        try {
            Optional<ProductModel> product = _productRepository.findById(id);
            if(product != null){
                // _productRepository.delete(product);

            }
            return true;
        } catch (Exception e) {
            return false;
        }         
    }
}
