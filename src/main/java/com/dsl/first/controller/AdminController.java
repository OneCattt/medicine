package com.dsl.first.controller;


import com.dsl.first.base.BaseController;
import com.dsl.first.model.Admin;
import com.dsl.first.service.AdminService;
import com.dsl.first.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName AdminController
 *@Description 管理员
 *@Author jiangruliang
 *@Date 2019/5/16 10:33 PM
 *@Version 1.0
 */
@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController {
    @Autowired
    private AdminService adminService;

    /**
     * @Author jiangruliang
     * @Description 管理员登录
     * @Date 9:32 PM 2019/5/16
     **/
    @GetMapping("/config")
    public Map<String, Object> getConfig(@RequestParam(name = "username") String username,@RequestParam(name = "password") String password){
        password=MD5Util.getMD5String(password);
        Map<String, Object> map=new HashMap<>();
        try {
            map.put("admin",adminService.getAdmin(username,password));
        } catch (Exception e) {
           return failedMessage(e.getMessage());
        }
        return successData(map);
    }

    @PostMapping("/config")
    public Map<String, Object> postConfig(@RequestBody @Validated Admin admin){
        //TODO 校验用户名密码是否正确 或者直接 根据用户名和密码更新数据库
        System.out.println(admin);
        return successMessage("核销券码成功");
    }

    @Override
    public void getErrorLog(String errorMsg) {

    }

    @Override
    public void getBaseLogger(Class<?> clazz, String errorMsg) {

    }
}
