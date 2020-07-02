package com.cui.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JdbcTemplate最基本用法
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        // 准备数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://192.168.1.5:3306/spring");
        ds.setUsername("root");
        ds.setPassword("123456");
        // 创建JdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate(ds);
        // 执行操作
        jt.execute("insert into account (name, money) values ('ddd', 1000)");
    }
}