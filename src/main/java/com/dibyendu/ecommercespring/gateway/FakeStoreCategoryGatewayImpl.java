package com.dibyendu.ecommercespring.gateway;

import com.dibyendu.ecommercespring.dto.CategoryDTO;
import com.dibyendu.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import com.dibyendu.ecommercespring.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGatewayImpl implements CategoryGateway
{
    // Gateway implementation for fetching categories from the Fake Store API
    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    // Constructor injection for FakeStoreCategoryApi
    public FakeStoreCategoryGatewayImpl(FakeStoreCategoryApi fakeStoreCategoryApi)
    {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        // Make the http call to the Fake Store API to fetch all categories
        FakeStoreCategoryResponseDTO responseDTO = this.fakeStoreCategoryApi.getAllCategories().execute().body();
        if (responseDTO == null)
        {
            throw new IOException("Failed to fetch categories from Fake Store API");
        }

        return responseDTO.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();

    }
}
