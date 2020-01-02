package com.qfedu;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class demo1 {
    @Test
   public void test(){
        Jedis jedis = new Jedis("192.168.137.128", 6379);
        String name = jedis.get("name");
        System.out.println(name);

        jedis.set("password","12345");
        System.out.println(jedis.get("password"));
    }
    @Test
    public void test2(){
        JedisPoolConfig jpc = new JedisPoolConfig();
        jpc.setMaxTotal(200);//设置最大连接数
        //获取池对象
        JedisPool jedisPool = new JedisPool(jpc,"192.168.137.128",6379);
        //获取Jedis对象
        Jedis jedis = jedisPool.getResource();
        String name = jedis.get("name");
        System.out.println(name);
        jedis.set("password","12345");
        System.out.println(jedis.get("password"));
    }
}
