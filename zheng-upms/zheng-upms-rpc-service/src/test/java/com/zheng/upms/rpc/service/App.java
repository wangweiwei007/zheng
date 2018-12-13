package com.zheng.upms.rpc.service;

import redis.clients.jedis.Jedis;

public class App
{
    public static void main( String[] args )
    {
        Jedis jedis = new Jedis("47.95.114.31",6379);
        //jedis.auth("123456");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
    }
}