package com.siddd00474.productsaleapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sale {
    @Id
    private long slNo;
    private long SalesmanID;
    private String SalesmanName;
    private long dos;


}


