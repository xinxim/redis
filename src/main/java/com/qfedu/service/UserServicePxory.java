package com.qfedu.service;

public class UserServicePxory  implements UserService{
    //真实角色
private UserService userService;
    @Override
    public void add() {
        log("add");
        userService.add();

    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void delete() {
        log("delete");
            userService.delete();
    }

    @Override
    public void seach() {
        log("seach");
        userService.seach();
    }

    public void log(String methodName){
        System.out.println("执行"+ methodName +"方法");
    }


}
