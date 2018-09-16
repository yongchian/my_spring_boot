package com.edu.spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class EncodingConvertConfiguration {
  
  @Bean
  public EncodingConvert createUtf8Convert() {
    return new Utf8Convert();
  }
  
  @Bean
  public EncodingConvert createGBKConvert() {
    return new GBKConvert();
  }
}
