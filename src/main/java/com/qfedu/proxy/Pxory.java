package com.qfedu.proxy;

public class Pxory implements Rent {
    private Host host;
    public Pxory() {
    }
    //通过构造方法将host传给pxory
    public Pxory(Host host){
        this.host = host;
    }
  //通过set方法将houst传给pxory这样跳过private Host host
    public void setHost(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seehousr();
        fare();
    }

   private void seehousr(){
       System.out.println("带你去看房");
   }

   private void fare(){
       System.out.println("收取中介费");
   }
}
