package com.jrlsf.activity_backend.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.jrlsf.activity_backend.models.Category;

@RestController
public class CategoryController {
    private List<Category> categories = Arrays.asList(new Category(1, "Eletrônicos"),
    new Category(2, "Consumíveis"),
    new Category(3, "Idéias"));
}
