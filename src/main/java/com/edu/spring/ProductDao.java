package com.edu.spring;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDao {
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  public void addProduct(String name) {
    String sql = "insert into product (pname) values ('" + name + "')";
    jdbcTemplate.execute(sql);
  }
  
  @Transactional
  public void addProductBatch(String ... names) throws FileNotFoundException {
    for(String name : names) {
      String sql = "insert into product (pname) values ('" + name + "')";
      jdbcTemplate.execute(sql);
      if(true) {
        throw new RuntimeException();
      }
    }
  }
}
