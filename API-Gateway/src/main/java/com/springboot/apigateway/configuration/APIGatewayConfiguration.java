package com.springboot.apigateway.configuration;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayConfiguration {
	
	
	/*
	 * Route Locator will route the requests to specific url if it matches the perdicate,
	 * it acts a filter to each requests.
	 * 
	 */
	@Bean
	public RouteLocator getRouteLocator(RouteLocatorBuilder builder){
				
		return builder.routes()
				.route( p -> p.path("/get")
						.uri("http://httpbin.org:80"))
				.route(p -> p.path("/ria-exchange/**")
						.uri("lb://ria-exchange"))
				.route(p -> p.path("/currency-conversion/**")
						.uri("lb://currency-conversion"))
				.route(p -> p.path("/currency-conversion-feign/**")
						.uri("lb://currency-conversion"))
				
				
				
				
				.build();
	}
	

}
