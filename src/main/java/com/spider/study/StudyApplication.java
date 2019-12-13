package com.spider.study;

import com.geccocrawler.gecco.GeccoEngine;
import com.spider.study.config.SpringGeccoEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Bean
    public SpringGeccoEngine initGecco() {
        return new SpringGeccoEngine() {
            @Override
            public void init() {
                GeccoEngine.create()
                        .pipelineFactory(springPipelineFactory)
                        .classpath("com.spider.study.demo")
                        .start("https://github.com/xtuhcy/gecco")
                        .interval(2000)
                        .loop(false)
                        .debug(false)
                        .start();
            }
        };
    }

}
