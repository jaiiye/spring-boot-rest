package org.hyp.springboot.config;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean characterEncodingFilter() {
        System.out.println("Init FilterRegistrationBean");
        return new FilterRegistrationBean(new CharacterEncodingFilter());
    }

}
