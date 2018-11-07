package com.cor.aaa.util;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:范博源
 * @Date:2018-11-5 16:13
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/CCMS/images/CorPerPic/**").addResourceLocations("file:F:/Study/IdeaFile/ComCorManSys/src/ain/resources/tatic/images/CorPerPic/");
    }

}
