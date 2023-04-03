package com.greedy.auto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Set;

@Configuration
public class SpringConfiguration {

    @Value("${test.value}")
    private String value;

    @Value("${test.list}")
    private List<String> list;

    @Value("${test.greeting}")
    private String greeting;

    @Value("${test.array}")
    private Set<String> array;

    @Value("${username}")
    private String username;

    @Bean
    public Object propertyReadTest() {

        System.out.println("value = " + value);
        System.out.println("list = " + list);

        System.out.println("greeting = " + greeting);

        array.forEach(System.out::println);

        System.out.println("username= " + username);

        return new Object();
    }
}
