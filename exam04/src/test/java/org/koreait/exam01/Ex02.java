package org.koreait.exam01;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class Ex02 {

    @Test
    void test1(){
  /*연결 설정 S*/
    DataSource ds= new DataSource();
    ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
    ds.setUsername("spring6");
    ds.setPassword("oracle");
        /*연결 설정 E*/
        /*커넥션 풀 설정 S*/
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setTimeBetweenEvictionRunsMillis(10*1000); //10초 간격으로 유효 커넥션 연결 상태 체크
        ds.setMinEvictableIdleTimeMillis(50*1000);//50초가 지난 유효 객체 소명 새로운 객체로 생성
        /*커넥션 풀 설정 E*/
try( Connection conn = ds.getConnection()) {
    System.out.println(conn);

}catch (SQLException e){
    e.printStackTrace();
}
    }
}
