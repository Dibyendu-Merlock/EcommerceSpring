package com.dibyendu.ecommercespring.controllers;

import com.dibyendu.ecommercespring.dto.CategoryDTO;
import com.dibyendu.ecommercespring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController
{
    private final CategoryService categoryService;

    // Constructor injection for CategoryService
    CategoryController(CategoryService categoryService)
    {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        return  this.categoryService.getAllCategories();
    }
}
