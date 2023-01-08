package com.itheima.springboot_mybatis;

import com.itheima.springboot_mybatis.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {


    @Autowired
    private EmployeeDao employeeDao;
    @Test
    void contextLoads() {

        System.out.println(employeeDao.getByid(1));
    }

}
