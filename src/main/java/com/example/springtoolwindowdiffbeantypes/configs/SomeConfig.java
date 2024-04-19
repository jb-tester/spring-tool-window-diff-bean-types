package com.example.springtoolwindowdiffbeantypes.configs;

import com.example.springtoolwindowdiffbeantypes.configs.beans.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.springtoolwindowdiffbeantypes.configs.beans.Bean1;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

/**
 * *
 * <p>Created by Irina on 4/19/2024.</p>
 * <p>Project: spring-tool-window-diff-bean-types</p>
 * *
 */
@Configuration("javaConfiguration")
@ImportResource("classpath:spring-config.xml")
public class SomeConfig {
    @Bean(name = "beanMethodBean")
    public Bean1 mybean1() {
        return new Bean1("mybean1");
    }


}
