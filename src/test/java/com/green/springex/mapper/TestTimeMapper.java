package com.green.springex.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class) //@ 주석이 달린 클래스 또는 테스트메서드에 대한 확장을 등록하는ㄷ ㅔ사용하는 반복가능한 주석
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TestTimeMapper {

    @Autowired(required = false) //해당 객체를 주입받지 못하더라도 예외가 발생하지 않음
    private TimeMapper timeMapper;

    @Test
    public void testTime(){
        log.info("현재시각: "+timeMapper.getTime());
    }

    @Test
    public void testTime2(){

    }

}
