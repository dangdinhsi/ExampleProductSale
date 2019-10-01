package com.siddd00474.productsaleapp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    private long productID;
    private String productName;
    private String Desciption;
    private long DateOfManf;
    private double price;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "slNo")
    private Sale sale;
}
