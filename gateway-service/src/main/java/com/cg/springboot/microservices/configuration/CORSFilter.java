package com.cg.springboot.microservices.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

public class CORSFilter implements WebFluxConfigurer {

	   @Override
	   public void addCorsMappings(CorsRegistry registry) {
	      registry.addMapping("/**")
	            .allowCredentials(true)
	            .allowedOrigins("*")
	            .allowedHeaders("*")
	            .allowedMethods("*");
	   }

	   @Bean
	   public CorsWebFilter corsWebFilter() {
	      CorsConfiguration corsConfiguration = new CorsConfiguration();
	      corsConfiguration.setAllowCredentials(true);
	      corsConfiguration.addAllowedHeader("*");
	      corsConfiguration.addAllowedMethod("*");
	      corsConfiguration.addAllowedOrigin("*");
	      UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
	      corsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
	      return new CorsWebFilter(corsConfigurationSource);
	   }
	}
