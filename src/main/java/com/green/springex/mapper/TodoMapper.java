package com.green.springex.mapper;

import com.green.springex.domain.TodoVO;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);

}
