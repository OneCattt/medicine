package com.dsl.first.service;

import com.dsl.first.constant.ErrorConstant;
import com.dsl.first.mapper.AdminMapper;
import com.dsl.first.model.Admin;
import com.dsl.first.util.NomalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author jiangruliang
 * @Date 2019/5/16 9:29 PM
 * @Version 1.0
 */
@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin getAdmin(String userName,String password) throws Exception {
        Admin admin=new Admin();
        admin.setUsername(userName);
        admin.setPassword(password);
        admin=adminMapper.selectAdmin(admin);
        if (NomalUtil.isNullOrEmpty(admin)){
            throw new Exception(ErrorConstant.USER_PASSWORD_ERROR);
        }
        return admin;
    }
}
