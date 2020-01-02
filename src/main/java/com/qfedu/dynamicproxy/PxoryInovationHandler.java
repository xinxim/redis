package com.qfedu.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//生成动态代理类
public class PxoryInovationHandler implements InvocationHandler {
   //抽象角色
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类
    public Object getPxory(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //pxory:代理类  method;代理类的调用程序（接口的方法）的方法对象
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       //反射  obj是真实对象的参数 执行某个对象
        //实际上真实对象是meiyu de
        Object result = method.invoke(rent, args);
        return null;
    }
}
