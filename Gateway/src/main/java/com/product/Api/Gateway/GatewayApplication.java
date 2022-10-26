package com.product.Api.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

	@Bean()
	public RouteLocator configureRoute(RouteLocatorBuilder builder) {
		return builder.routes()
//				.route("paymentId", r->r.path("/payment/**").uri("http://localhost:9009")) //static routing
				.route("productId", r->r.path("/product").uri("lb://product-service")) //dynamic routing
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
