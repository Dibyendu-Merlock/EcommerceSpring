package com.dibyendu.ecommercespring.services;

import com.dibyendu.ecommercespring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface CategoryService
{
    List<CategoryDTO> getAllCategories() throws IOException;
}
