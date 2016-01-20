package com.example.anno3;

import com.example.anno1.UserNameAnnotations;
import com.example.anno2.MethodType;
import com.example.anno2.MethodType.MethodTypeEnum;


/** 
 * 一个注解的测试类 
 * @author zhuli 
 * @date 2014-7-5 
 */  
//注入注解作用于类上面  
//可以通过反射 获取类的信息之后 获取得到这个注解的值 
@UserNameAnnotations(value = "zhanrui") 
public class Person {
    @FieldAnnotations(value="zhanrui")  
    private String userName;  
  
    //注解到  
    @MethodType(methodType=MethodTypeEnum.TYPE2)  
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
}
