package com.qfedu.proxy;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Pxory pxory = new Pxory(host);
        pxory.rent();
    }
}
