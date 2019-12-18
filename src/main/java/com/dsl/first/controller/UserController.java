package com.dsl.first.controller;

import com.dsl.first.base.BaseController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author TOPFEEL
 * @Date 2019/5/16 17:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @PostMapping("/register")
    public Map<String, Object> register(@RequestParam(name = "username") String username,@RequestParam(name = "password") String password){
       //TODO 校验用户名是否存在
        System.out.println(username);
        System.out.println(password);
        return successMessage("注册成功");
    }

    @Override
    public void getErrorLog(String errorMsg) {

    }

    @Override
    public void getBaseLogger(Class<?> clazz, String errorMsg) {

    }
}
