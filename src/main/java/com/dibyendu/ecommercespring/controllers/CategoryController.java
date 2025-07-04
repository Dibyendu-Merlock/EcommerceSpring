package com.dibyendu.ecommercespring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController
{
    @GetMapping
    public String getCategory()
    {
        return "Electronics";
    }

    @PostMapping
    public String getPostCategory()
    {
        return "Category created successfully!";
    }

    @GetMapping("/count") // If we call a GET request to /api/categories/count, it will return the count of categories
    public int getCategoryCount()
    {
        return 5; // This is a placeholder. In a real application, you would fetch this from a database.
    }



}
