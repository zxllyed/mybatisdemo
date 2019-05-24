package com.zxlala.demo.dao.impl;

import com.zxlala.demo.dao.CustomerDao;
import com.zxlala.demo.pojo.Customer;
import com.zxlala.demo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    public Customer getCusById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        Customer customer = sqlSession.selectOne("customer.queryCusById", id);
        return customer;
    }

    public List<Customer> getCusByName(String name) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        List<Customer> list = sqlSession.selectList("customer.queryCusByName", name);
        return list;
    }

    public void InsertCus(Customer customer) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        sqlSession.insert("customer.saveCus", customer);
        sqlSession.commit();
        sqlSession.close();
    }
}