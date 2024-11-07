package org.koreait.exam02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.globle.config.AppCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    @DisplayName("insert 쿼리 테스트")
    void test1(){
    String sql="INSERT INTO MEMBER (SEQ,EMAIL,PASSWORD,USERNAME) VALUES (MEMBER_SEQ.nextval,?,?,?)";
    int affectecRows=jdbcTemplate.update(sql,"user05@test.org" ,"123456","사용자04");

        System.out.println(affectecRows);
    }

}
