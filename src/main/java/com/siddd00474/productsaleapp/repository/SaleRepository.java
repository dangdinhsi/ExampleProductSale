package com.siddd00474.productsaleapp.repository;

import com.siddd00474.productsaleapp.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}
