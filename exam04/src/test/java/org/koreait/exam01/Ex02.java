package org.koreait.exam01;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class Ex02 {

    @Test
    void test1(){
    DataSource ds= new DataSource();
    ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    ds.setUrl("jdbc:oracle:thin:@localhost:XE");
    ds.setUsername("spring6");
    ds.setPassword("oracle");

try( Connection conn = ds.getConnection()) {
    System.out.println(conn);

}catch (SQLException e){
    e.printStackTrace();
}
    }
}
