package com.example.gatewayservice.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {
    // yml 에 정의한 내영과 같은 내용이라고 이해 하자.
//    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/first-service/**")
                        .filters(f -> f.addRequestHeader("first-request","first-request-header")
                                .addRequestHeader("first-response","first-response-header"))
                        .uri("http://localhost:8081"))
                .route(r -> r.path("/second-service/**")
                        .filters(f -> f.addRequestHeader("second-request","second-request-header")
                                .addRequestHeader("second-response","second-response-header"))
                        .uri("http://localhost:8082"))
                .build();
    }


}
