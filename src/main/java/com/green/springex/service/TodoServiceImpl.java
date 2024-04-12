package com.green.springex.service;

import com.green.springex.domain.TodoVO;
import com.green.springex.dto.TodoDTO;
import com.green.springex.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    private final TodoMapper todoMapper;


    private final ModelMapper modelMapper;

    @Override
    public void register(TodoDTO todoDTO) {
        log.info("modelMapper: "+modelMapper);

        TodoVO todoVO=modelMapper.map(todoDTO, TodoVO.class);
        log.info("todoVO: "+todoVO);

        todoMapper.insert(todoVO);

    }
}
