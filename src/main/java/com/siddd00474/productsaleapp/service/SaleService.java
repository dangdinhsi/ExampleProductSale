package com.siddd00474.productsaleapp.service;

import com.siddd00474.productsaleapp.entity.Product;
import com.siddd00474.productsaleapp.entity.Sale;
import com.siddd00474.productsaleapp.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    public Sale findById(long id){
        return saleRepository.findById(id).orElse(null);
    }
}
