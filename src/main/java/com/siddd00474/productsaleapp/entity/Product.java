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

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String desciption) {
        Desciption = desciption;
    }

    public long getDateOfManf() {
        return DateOfManf;
    }

    public void setDateOfManf(long dateOfManf) {
        DateOfManf = dateOfManf;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
