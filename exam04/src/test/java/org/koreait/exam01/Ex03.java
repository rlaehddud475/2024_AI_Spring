package org.koreait.exam01;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03 {
    private Connection conn;
    @BeforeEach
    void init() throws Exception{
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
        conn=ds.getConnection();
    }
    @AfterEach
    void close() throws Exception{
        conn.close();
    }
    @Test
    @DisplayName("Statement 객체 생성 및 연습")
    void test1(){
        try (Statement stmt=conn.createStatement()){
            String email="user01@test.org";
            String password="12345678";
            String userName="사용자01";

    String sql =String.format( "INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USERNAME)"+
            "VALUES (MEMBER_SEQ.nextval, %s, %s, %s)",email,password,userName);
        int affectedRows=stmt.executeUpdate(sql);
            System.out.println(affectedRows);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    @Test
    @DisplayName("PreparedStatement 객체 생성 및 연습")
    void test2(){
        String sql = "INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USERNAME) VALUES (MEMBER_SEQ.nextval, ?, ?, ?)";
        try (PreparedStatement pstmt=conn.prepareStatement(sql)){
        pstmt.setString(1,"user02@test.org");
            pstmt.setString(2,"12345678");
            pstmt.setString(3,"사용자02");
            int affectedRows=pstmt.executeUpdate();
            System.out.println(affectedRows);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
