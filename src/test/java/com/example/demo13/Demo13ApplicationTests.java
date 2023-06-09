package com.example.demo13;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo13ApplicationTests {
@Autowired

zouye zouye;
    @Test
    public void getHello(){
        System.out.println("单元测试返回的数据---"+zouye.hellosay());
    }

    void contextLoads() {
        String result =zouye.hellosay();
        System.out.println("返回测试"+result);
    }

}
