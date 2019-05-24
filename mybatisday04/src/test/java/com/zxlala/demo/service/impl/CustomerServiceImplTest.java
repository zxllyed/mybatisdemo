package com.zxlala.demo.service.impl;

import com.zxlala.demo.pojo.Customer;
import com.zxlala.demo.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CustomerServiceImplTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void queryCusById() {
        Customer customer = customerService.queryCusById(1);
        System.out.println(customer);
    }
}