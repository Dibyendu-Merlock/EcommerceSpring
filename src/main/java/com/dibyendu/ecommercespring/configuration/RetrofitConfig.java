package com.dibyendu.ecommercespring.configuration;

import com.dibyendu.ecommercespring.gateway.api.FakeStoreCategoryApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig
{
    @Bean
    public Retrofit retrofit()
    {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/") // Base URL for the Fake Store API
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit)
    {
        return retrofit.create(FakeStoreCategoryApi.class);
    }

}
