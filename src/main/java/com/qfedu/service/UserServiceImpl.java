package com.qfedu.service;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        //打印日志 重复繁琐
        //System.out.println("执行add方法");

        //log("add");
        System.out.println("增加用户");
    }

    @Override
    public void update() {
        //System.out.println("执行修改方法");
        //log("update");
        System.out.println("修改用户");
    }

    @Override
    public void delete() {
       // System.out.println("执行删除方法");
        //log("delete");
        System.out.println("删除用户");
    }

    @Override
    public void seach() {
       // System.out.println("执行查找方法");
        //log("seach");
        System.out.println("查找用户");
    }

    //将打印日志提出来，写成一个方法
//    public void log(String methodName){
//        System.out.println("执行"+methodName+"方法");
//    }
}
