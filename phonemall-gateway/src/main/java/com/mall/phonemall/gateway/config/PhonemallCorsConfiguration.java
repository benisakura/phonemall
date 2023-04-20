package com.mall.phonemall.gateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class PhonemallCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter(){

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
       CorsConfiguration corsConfigurationSource=new CorsConfiguration();


       corsConfigurationSource.addAllowedHeader("*");
       corsConfigurationSource.addAllowedMethod("*");
       corsConfigurationSource.addAllowedOrigin("*");
       corsConfigurationSource.setAllowCredentials(true);
        source.registerCorsConfiguration("/**",corsConfigurationSource);
        return  new CorsWebFilter(source);

    }
}
