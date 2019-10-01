package com.siddd00474.productsaleapp.controller;

import com.siddd00474.productsaleapp.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;
}
