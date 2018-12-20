package com.example.sericefeign.demo.service.impl;

import com.example.sericefeign.demo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Author hello
 * @Date 2018/12/20 21:47
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
