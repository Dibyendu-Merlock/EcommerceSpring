package com.dibyendu.ecommercespring.services;

import com.dibyendu.ecommercespring.dto.CategoryDTO;
import com.dibyendu.ecommercespring.gateway.CategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryServiceImpl implements CategoryService
{
    private final CategoryGateway categoryGateway;

    // Constructor injection for CategoryGateway
    public FakeStoreCategoryServiceImpl(CategoryGateway categoryGateway)
    {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        return this.categoryGateway.getAllCategories();
    }
}
