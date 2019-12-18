package com.dsl.first.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName LogAspect
 * @Description TODO
 * @Author jiangruliang
 * @Date 2019/4/1 8:55 AM
 * @Version 1.0
 */
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
    //切点
    @Pointcut("@annotation(com.dsl.first.annotation.Log)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        // 执行方法
        Object result = point.proceed();
        // 执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        //异步保存日志
        //saveLog(point, time);
        return result;
    }

}

