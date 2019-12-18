package com.dsl.first.base;


import com.dsl.first.enums.ErrorEnum;

import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName BaseController
 *@Description 控制层基类
 *@Author jiangruliang
 *@Date 2019/5/16 17:04
 *@Version 1.0
 */
public abstract class BaseController implements BaseLogger
{
    /**
     * <一句话功能简述> 失败返回信息 <功能详细描述>
     * @param code
     * @return
     * @see [类、类#方法、类#成员]
     */
    public Map<String, Object> failedMessage(String code)
    {
        Map<String, Object> map = new HashMap<>(3);
        map.put("code", code);
        map.put("status", "failed");
        map.put("message", ErrorEnum.getMsg(code));
        return map;
    }

    /**
     * <一句话功能简述> 成功返回信息 <功能详细描述>
     * @param message
     * @return
     * @see [类、类#方法、类#成员]
     */
    public Map<String, Object> successMessage(String message)
    {
        Map<String, Object> map = new HashMap<>(3);
        map.put("code", "0");
        map.put("status", "success");
        map.put("message", message);
        return map;
    }

    /**
     * <一句话功能简述> 成功返回数据 <功能详细描述>
     * @param data
     * @return
     * @see [类、类#方法、类#成员]
     */
    public Map<String, Object> successData(Map<String, Object> data)
    {
        Map<String, Object> map = new HashMap<>(3);
        map.put("code", "0");
        map.put("status", "success");
        map.put("data", data);
        return map;
    }
    /**
     * <一句话功能简述>
     * define error level log
     * <功能详细描述>
     * @param errorMsg
     * @see [类、类#方法、类#成员]
     */
    public abstract void getErrorLog(String errorMsg);
}
