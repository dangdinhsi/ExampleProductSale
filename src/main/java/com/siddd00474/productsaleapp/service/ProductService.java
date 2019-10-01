package com.siddd00474.productsaleapp.service;

import com.siddd00474.productsaleapp.entity.Product;
import com.siddd00474.productsaleapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product findById(long id){
        return productRepository.findById(id).orElse(null);
    }
}
