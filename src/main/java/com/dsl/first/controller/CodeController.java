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
@RequestMapping("/code")
public class CodeController extends BaseController {

    @PostMapping("/writeoff")
    public Map<String, Object> register(@RequestParam(name = "ticketcode") String ticketcode){
        System.out.println(ticketcode);
        return successMessage("核销券码成功");
    }

    @Override
    public void getErrorLog(String errorMsg) {

    }

    @Override
    public void getBaseLogger(Class<?> clazz, String errorMsg) {

    }
}
