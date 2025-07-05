package com.dibyendu.ecommercespring.gateway.api;

import com.dibyendu.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

@Component
public interface FakeStoreCategoryApi
{
    // Retrofit API endpoint to fetch all categories from the Fake Store API
    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException;
}
