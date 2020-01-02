package com.qfedu.dynamicproxy;

import com.qfedu.dynamicproxy.Rent;

public class Host implements Rent{

    @Override
    public void rent() {

        System.out.println("出租房子");
    }
}
