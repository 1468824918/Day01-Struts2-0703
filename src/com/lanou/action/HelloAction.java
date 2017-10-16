package com.lanou.action;

/**
 * Created by dllo on 17/10/10.
 */
public class HelloAction {
    /**
     * 动作方法
     * 访问权限必须是public, Struts才能访问到该方法
     * 返回类型必须是String, 代表该动作执行之后的结果
     */
    public String say(){
        System.out.println("你好,蓝鸥");
        return "success";
    }
}
