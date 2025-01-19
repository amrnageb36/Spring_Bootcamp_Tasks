package com.adminPanel.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter {
    public void addResoutceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources");
    }
}
