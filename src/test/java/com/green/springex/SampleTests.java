package com.green.springex;

import com.green.springex.sample.SampleService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class) //@ 주석이 달린 클래스 또는 테스트메서드에 대한 확장을 등록하는ㄷ ㅔ사용하는 반복가능한 주석
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {


    @Autowired
    private SampleService sampleService;
    @Autowired
    private DataSource dataSource;

    @Test
    public void testService1(){
        log.info("samplerService객체; "+sampleService);
        Assertions.assertNotNull(sampleService);
    }

    //DB 연결 테스트
    @Test
    public void testConnect() throws  Exception{
        Connection connection =dataSource.getConnection();
        log.info("커넥션 객체: "+connection);
        Assertions.assertNotNull(connection);
        connection.close();
    }

}
