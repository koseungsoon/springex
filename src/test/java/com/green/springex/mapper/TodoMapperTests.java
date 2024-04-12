package com.green.springex.mapper;

import com.green.springex.domain.TodoVO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
@Log4j2
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTests {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testGetTime(){
        log.info("현지시간: " +todoMapper.getTime());
    }


    @Test
    public void testInsert(){
        TodoVO todoVO = TodoVO.builder()
                .title("스프링 테스트 ")
                .dueDate(LocalDate.of(2022,10,10))
                .writer("user00")
                .build();

        todoMapper.insert(todoVO);
    }

}
