package com.green.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
//@RequiredArgsConstructor
public class SampleService {

    @Autowired
    private  SampleDAO sampleDAO;


}
