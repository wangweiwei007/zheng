package com.zheng.upms.server;

import com.zheng.upms.dao.model.UpmsSystemExample;
import com.zheng.upms.dao.model.UpmsUser;
import com.zheng.upms.rpc.api.UpmsSystemService;
import com.zheng.upms.rpc.api.UpmsUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * 单元测试
 * Created by shuzheng on 2017/2/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml",
        "classpath:applicationContext-dubbo-consumer.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class UpmsServiceTest {

    @Autowired
    private UpmsSystemService upmsSystemService;
    @Autowired
    private UpmsUserService upmsUserService;

    @Test
    public void index() {
        int count = upmsSystemService.countByExample(new UpmsSystemExample());
        System.out.println(count);
    }

    @Test
    public void add(){
        UpmsUser upmsUser=new UpmsUser();
        upmsUser.setUsername("张三");
        upmsUser.setPassword("123456");
        upmsUser= upmsUserService.createUser(upmsUser);
        System.out.println(upmsUser);
    }

    @Test
    public void update(){
        UpmsUser upmsUser=new UpmsUser();
        upmsUser.setUsername("张三");
        upmsUser.setPassword("1234567");
        upmsUser= upmsUserService.updateUser(upmsUser);
        System.out.println(upmsUser);
    }

}
