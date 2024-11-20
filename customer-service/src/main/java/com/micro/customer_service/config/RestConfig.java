package com.micro.customer_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.micro.customer_service.entity.Customer;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // Expose the IDs for Customer entities
        config.exposeIdsFor(Customer.class);

        // Optional: Configure CORS settings if needed
        // cors.addMapping("/**")
        //     .allowedOrigins("http://localhost:3000")
        //     .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
