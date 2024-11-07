package org.koreait.globle.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DBConfig {
    @Bean
    public DataSource dataSource(){
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("spring6");
        ds.setPassword("oracle");
        ds.setTestWhileIdle(true);
        ds.setTimeBetweenEvictionRunsMillis(3*1000);
        ds.setMinEvictableIdleTimeMillis(50 * 1000);
        return ds;
    }

    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate();
    }
}
