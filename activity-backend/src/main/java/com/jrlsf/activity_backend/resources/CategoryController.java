package com.jrlsf.activity_backend.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.jrlsf.activity_backend.models.Category;

import jakarta.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CategoryController {
    private List<Category> categories = Arrays.asList(new Category(1, "Eletrônicos"),
    new Category(2, "Consumíveis"),
    new Category(3, "Idéias"),
    new Category(4, "Produção Própria"),
    new Category(5, "Nacional"),
    new Category(6, "Importado"));

    @PostConstruct
    public void init() {
        //VE
    }
    @GetMapping("categories/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable int id){
        Category cat = categories.stream()
        .filter(p -> p.getid() == id)
        .findFirst()
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category Not Found"));

        return ResponseEntity.ok(cat);
    }
    @GetMapping("categories")
    public List<Category> getCategories(){
        return categories;
    }
}
