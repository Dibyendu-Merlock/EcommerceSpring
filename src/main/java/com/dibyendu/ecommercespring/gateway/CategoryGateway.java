package com.dibyendu.ecommercespring.gateway;

import com.dibyendu.ecommercespring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface CategoryGateway
{
    List<CategoryDTO> getAllCategories() throws IOException;
}
