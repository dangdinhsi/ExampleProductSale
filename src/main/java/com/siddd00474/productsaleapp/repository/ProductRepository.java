package com.siddd00474.productsaleapp.repository;

import com.siddd00474.productsaleapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
