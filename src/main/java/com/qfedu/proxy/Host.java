package com.qfedu.proxy;

import com.alibaba.druid.support.json.JSONUtils;

public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("出租房子");
    }
}
