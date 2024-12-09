package com.gen.prepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PrePracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrePracticeApplication.class, args);
    }

}
