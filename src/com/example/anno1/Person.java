package com.example.anno1;


/** 
 * 一个注解的测试类 
 * @author zhuli 
 * @date 2014-7-5 
 */  
//注入注解作用于类上面  
//可以通过反射 获取类的信息之后 获取得到这个注解的值 
@UserNameAnnotations(value = "zhanrui") 
public class Person {
    private String userName;  
    
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
}
