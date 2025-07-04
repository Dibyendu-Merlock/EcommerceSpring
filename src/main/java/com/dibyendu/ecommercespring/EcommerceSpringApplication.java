package com.dibyendu.ecommercespring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication
{

    public static void main(String[] args)
    {
        // Load environment variables from .env file
        Dotenv dotenv= Dotenv.configure().load();

        // Set each environment variable as a system property
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));


        SpringApplication.run(EcommerceSpringApplication.class, args);
    }

}
