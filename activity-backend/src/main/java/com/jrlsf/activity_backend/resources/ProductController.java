package com.jrlsf.activity_backend.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jrlsf.activity_backend.models.Product;

import jakarta.annotation.PostConstruct;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//Imports do Rest Controller, GetMapping, Product.java
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin
public class ProductController {

    private List<Product> products = Arrays.asList(new Product(1, "Ship 01", "The Firsy First Ship", 37.9,  3, true, true),
                                        new Product(2, "Ship 02", "The OnWay Ship", 88.99, 4, true, true),
                                        new Product(3, "Ship 03", "The Way Ship", 199.99, 5, true, true),
                                        new Product(4, "Ship 04", "The OnGoing Ship", 666.89, 6, true, true));
    
    //private List<Product> products = new ArrayList<>();
    //Use @PostController Para determinar que esse método retornará 
    //na forma de Post suas respostas para a solução
    
    @PostMapping("products")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        //TODO: process POST request
        product.setId(products.size()+1);
        products.add(product);


        URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(product.getId())
        .toUri();
        return ResponseEntity.created(location).body(product);
    }
    

    @PostConstruct
    public void init(){
        //Usando jSON precisa declarar o Product
        //do Models no lugar de String ou Int, ETC...
        //Product p1 = new Product(1, "Ship 01", 37.9);
        /*p1.setId(1);
        p1.setName("Ship 01");
        p1.setPrice(66.55); */

        //Product p2 = new Product(2, "Ship 02", 88.99);
        /* p2.setId(1);
        p2.setName("Ship 02");
        p2.setPrice(77.55);*/
        

        //Product p3 = new Product(3, "Ship 03", 199.99);
        /* p3.setId(1);
        p3.setName("Ship 03");
        p3.setPrice(88.55);
        products.add(p1);
        products.add(p2);
        products.add(p3);*/
    }

    @GetMapping("products/{id}")   
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        //Usando jSON precisa declarar o Product
        //do Models no lugar de String ou Int, ETC...
        /*Product p = new Product();
        p.setId(1);
        p.setName("Ship");
        p.setPrice(55.55);

        //return "Produto:Product"; 
        */
        /* Método durante as aulas 1.14, 1.15 e 1.16
        //Agora retorna um produto de products 
        //da barra de navegação pega da lista
        //Lista Disponível no método Void Init  
        if( id <= products.size()){
            return ResponseEntity.ok(products.get(id - 1));
        } else {
            //Retorna a resposta de Erro 404 do Navegador
            //return ResponseEntity.notFound().build();
            //Retorna a Mensagem de Erro 404 do servidor
            //definida pelo servidor logo abaixo
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Product not found");
        }
            */
        /* Método de Resposta na aula 1.17 e em diante */
        Product prod = products.stream()
        .filter(p -> p.getId() == id)
        //.findAny()
        .findFirst()
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Product Not Found")); //S

        return ResponseEntity.ok(prod);
    }
    @GetMapping("products")
    public List<Product> getProducts(){
        //Criação de uma Lista sendo um Array List JSON
        /*List <Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        */
        //Agora retorna os produtos da 
        //navegação por products da lista
        //Lista Disponível no método Void Init
        return products;
    }

}
