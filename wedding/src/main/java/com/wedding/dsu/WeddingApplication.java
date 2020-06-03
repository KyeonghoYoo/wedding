package com.wedding.dsu;

import java.util.Collections;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
public class WeddingApplication extends WebMvcConfigurerAdapter{
	public static void main(String[] args) {
		SpringApplication.run(WeddingApplication.class, args);
	}
	
	/*
	 * Filter 설정 
	 */
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean(new ReadableRequestWrapperFilter());
		registrationBean.addUrlPatterns("/*");
		return registrationBean;
	}
	/*
	 * 세션 및 쿠키 Locale 설정 
	 */
	@Bean
	public LocaleResolver localeResolver() {
//		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		localeResolver.setDefaultLocale(Locale.KOREA);
		return localeResolver;
	}
	/*
	 * swagger 설정
	 */
	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.wedding.dsu.controller"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"DSU2019 Backend", 
				"웨딩 ERP RESTful API", 
				"version 0.1", 
				"API TOS", 
				new Contact("Keongho Yoo", "https://github.com/KyeonghoYoo", "ykh6242@gmail.com"), 
				"License of API", 
				"API license URL", 
				Collections.emptyList());
	}
	/*
	 * 크로스 도메인
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("*")
		.allowedMethods("GET", "POST", "PUT", "DELETE")
		.allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers")
		.exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
		.allowCredentials(true).maxAge(10);
	}
	
	
}
