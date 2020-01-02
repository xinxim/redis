package com.qfedu.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
//        Pxory pxory = new Pxory(host);
        PxoryInovationHandler pih = new PxoryInovationHandler();
        pih.setRent(host);
        Rent pxory = (Rent) pih.getPxory();
        pxory.rent();
    }
}
