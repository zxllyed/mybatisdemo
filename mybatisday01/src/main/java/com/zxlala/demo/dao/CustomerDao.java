package com.zxlala.demo.dao;

import com.zxlala.demo.pojo.Customer;

import java.util.List;

public interface CustomerDao {

    Customer getCusById(Integer id);

    List<Customer> getCusByName(String name);

    void InsertCus(Customer customer);
}
