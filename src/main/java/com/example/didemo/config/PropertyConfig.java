package com.example.didemo.config;

import com.example.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    String userName;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource dataSource = new FakeDataSource();
        dataSource.setUserName(userName);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        return dataSource;
    }
}
