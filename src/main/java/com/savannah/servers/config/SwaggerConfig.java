package com.savannah.servers.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashSet;
import java.util.Set;

@OpenAPIDefinition(
        info = @Info(title = "Odee API 명세서",
        description = "내가 가는 모든 공간의 커뮤니티, Odee 서비스 API 명세서",
        version = "v1"))
@Configuration
@EnableWebMvc
public class SwaggerConfig {



}
