package com.micro.inventory_service.config;

import com.micro.inventory_service.entity.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // Expose the IDs for Product entities
        config.exposeIdsFor(Product.class);

        // Optional: Configure CORS settings if needed
        // cors.addMapping("/**")
        //     .allowedOrigins("http://localhost:3000")
        //     .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
