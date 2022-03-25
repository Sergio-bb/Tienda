package com.example.demo.repositories;

import com.example.demo.models.SaleModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends CrudRepository<SaleModel, Integer> {
}
    

