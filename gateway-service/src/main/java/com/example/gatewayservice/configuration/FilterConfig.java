package com.example.gatewayservice.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by peter on 2023/01/24
 */
//@Configuration
public class FilterConfig {
//    @Bean
    public RouteLocator gatewayRoute(RouteLocatorBuilder locatorBuilder) {
        return locatorBuilder.routes()
                .route(r -> r.path("/first-service/**")
                            .filters(f -> f.addRequestHeader("first-request", "first-request-header")
                                    .addResponseHeader("first-response", "first-response-header"))
                                    .uri("http://localhost:8081"))
                .route(r -> r.path("/second-service/**")
                        .filters(f -> f.addRequestHeader("second-request", "second-request-header")
                                .addResponseHeader("second-response", "second-response-header"))
                        .uri("http://localhost:8082"))
                .build();
    }
}
