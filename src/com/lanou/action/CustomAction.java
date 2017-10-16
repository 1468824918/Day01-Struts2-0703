package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dllo on 17/10/10.
 */
public class CustomAction extends ActionSupport{
    /**从Actionsupport类继承下来的动作方法
     * 当struts.xml中的action标签没有配置method属性时会调用的方法
     * **/

    //加注释啦
    //加注释啦
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    /**从Actionsupport类继承下的方法
     * 用户表单验证
     * 执行在动作方法前
     * 如果验证失败返回input
     **/
    @Override
    public void validate() {
        super.validate();
    }
    //验证全局结果集,即当前动作的结果在该action中没有定义时会查找该package包下的全局结果集中是否有对应的声明
    //有则直接执行,没有则返回错误
    public String customGlobleResult(){
        return ERROR;
    }
}
