package com.nba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@RestController
@RequestMapping("/user")
@EnableSwagger2
public class SwaggerDemoController {
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        ApiInfo apiInfo = new ApiInfo("sample of springboot",
                "sample of springboot",
                null,
                null,
                null,
                null,
                null);
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(regex("/.*"))
                .build()
                .apiInfo(apiInfo)
                .useDefaultResponseMessages(false);
        return docket;
    }
}
