package com.example.sericefeign.demo.controller;

import com.example.sericefeign.demo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HiController
 * @Author hello
 * @Date 2018/12/20 21:19
 **/
@RestController
public class HiController {

    @Resource
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name")String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
