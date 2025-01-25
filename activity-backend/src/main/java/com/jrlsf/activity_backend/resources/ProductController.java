package com.jrlsf.activity_backend.resources;

import org.springframework.web.bind.annotation.RestController;

import com.jrlsf.activity_backend.models.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//Imports do Rest Controller, GetMapping, Product.java

@RestController
public class ProductController {

    @GetMapping("product")   
    public Product getProduct(){
        //Usando jSON precisa declarar o Product
        //do Models no lugar de String ou Int, ETC...
        Product p = new Product();
        p.setId(1);
        p.setName("Ship");
        p.setPrice(55.55);
        
        return p;
        //return "Produto:Product";        
    }
    @GetMapping("products")
    public List<Product> getProducts(){
        //Usando jSON precisa declarar o Product
        //do Models no lugar de String ou Int, ETC...
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Ship 01");
        p1.setPrice(66.55);

        Product p2 = new Product();
        p2.setId(1);
        p2.setName("Ship 02");
        p2.setPrice(77.55);

        Product p3 = new Product();
        p3.setId(1);
        p3.setName("Ship 03");
        p3.setPrice(88.55);
        //Criação de uma Lista sendo um Array List JSON
        List <Product> listProd = new ArrayList<>();
        listProd.add(p1);
        listProd.add(p2);
        listProd.add(p3);

        return listProd;
    }

}
