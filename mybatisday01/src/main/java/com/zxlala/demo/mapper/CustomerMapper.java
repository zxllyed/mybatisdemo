package com.zxlala.demo.mapper;

import com.zxlala.demo.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    Customer queryCusById(Integer id);

    List<Customer> queryCusByName(String name);

    void saveCus(Customer customer);
}
