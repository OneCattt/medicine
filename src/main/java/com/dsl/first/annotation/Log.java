package com.dsl.first.annotation;

/**
 * @ClassName Log
 * @Description TODO
 * @Author jiangruliang
 * @Date 2019/4/1 8:53 AM
 * @Version 1.0
 */
public @interface Log {
    String value() default "";
}