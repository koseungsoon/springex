package com.green.springex.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //해당클래스가 스프링빈에 대한 설명을 하는 클래스임을 명시
public class ModelMapperConfig {

    @Bean //해당 메소드의 실행 결과로 반환된 객체를 스프링 빈으로 등록시키는 역할
    public ModelMapper getMapper(){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.LOOSE);

        return null;
    }
}
