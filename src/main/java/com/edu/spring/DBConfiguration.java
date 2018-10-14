package com.edu.spring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootConfiguration
public class DBConfiguration {
  @Autowired
  private Environment env;
  
  @Bean
  public DataSource createDataSource() {
    DruidDataSource ds = new DruidDataSource();
    ds.setUrl(env.getProperty("spring.datasource.url"));
    ds.setDriverClassName(env.getProperty("spring.datasource.driverclassName"));
    ds.setUsername(env.getProperty("spring.datasource.username"));
    ds.setPassword(env.getProperty("spring.datasource.password"));
    return ds;
  }
}
