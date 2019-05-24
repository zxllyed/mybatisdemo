package com.zxlala.demo.service.impl;

import com.zxlala.demo.mapper.CustomerMapper;
import com.zxlala.demo.pojo.Customer;
import com.zxlala.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Customer queryCusById(Integer id) {
        Customer customer = customerMapper.queryCusById(1);
        return customer;
    }
}
