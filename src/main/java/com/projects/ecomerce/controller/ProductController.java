package com.projects.ecomerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//just that api will be included in url
public class ProductController {

    @GetMapping("/products")
    public String getProducts(){
        return "All Products";
    }

}
