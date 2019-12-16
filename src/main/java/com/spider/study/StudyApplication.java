package com.spider.study;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;
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
//        HttpGetRequest startUrl = new HttpGetRequest("http://news.iresearch.cn/");
        HttpGetRequest startUrl = new HttpGetRequest("https://www.jinse.com/");
        startUrl.setCharset("GBK");
        return new SpringGeccoEngine() {
            @Override
            public void init() {
                GeccoEngine.create()
                        .classpath("com.spider.study.jscj")
                        .start(startUrl)
                        .interval(2000)
                        .loop(true)
                        .debug(false)
                        .start();
            }
        };
    }

}
