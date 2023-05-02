package com.SpringBoot.GamePrograms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface GamesInterface {
    @Bean
    void Up();
    @Bean
    void Down();
    @Bean
    void Right();
    @Bean
    void Left();
}
