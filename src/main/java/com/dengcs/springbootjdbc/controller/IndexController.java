package com.dengcs.springbootjdbc.controller;


import com.dengcs.springbootjdbc.service.Dataservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private Dataservice dataservice;

    @RequestMapping("/update")
    @ResponseBody
    public String update(String userid) {
        int i = dataservice.insert(userid);
        return "succ";
    }

}
