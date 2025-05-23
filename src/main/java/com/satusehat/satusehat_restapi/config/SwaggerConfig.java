package com.satusehat.satusehat_restapi.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error/*")))
                .paths(Predicates.not(PathSelectors.regex("/actuator")))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact(
                "Fascal Sapty Jarokohir",
                "Belum Ada Web Nanti Nyusul Ya :D",
                "fascalsj@gmail.com");
        return new ApiInfo(
                "Membangun Rest API dengan SpringBoot",
                "Ini adalah implementasi swagger pada Rest Spring Boot",
                "Version 1.0.0",
                "Diperuntukan untuk belajar siapapun bebas download",
                contact,
                "Gratis",
                "Gratis tis tis",
                Collections.emptyList());
    }

}
