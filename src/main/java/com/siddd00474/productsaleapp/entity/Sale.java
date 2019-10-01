package com.siddd00474.productsaleapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Sale {
    @Id
    private long slNo;
    private long SalesmanID;
    private String SalesmanName;
    private long dos;
    @OneToMany(mappedBy = "Product", cascade = CascadeType.ALL)
    private Set<Product> products;

    public long getSlNo() {
        return slNo;
    }

    public void setSlNo(long slNo) {
        this.slNo = slNo;
    }

    public long getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(long salesmanID) {
        SalesmanID = salesmanID;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public long getDos() {
        return dos;
    }

    public void setDos(long dos) {
        this.dos = dos;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}


