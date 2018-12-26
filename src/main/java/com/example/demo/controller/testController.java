package com.example.demo.controller;

import com.example.demo.pojo.ReturnResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ze
 * @date 2018/12/18 0018
 */
@RestController
@CrossOrigin  //解决跨域问题
public class testController {

    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public ReturnResult hello(HttpServletRequest request , HttpServletResponse response){
        String username = request.getParameter("username");
        System.out.println("username1");

        return ReturnResult.ok(username);
    }
}
