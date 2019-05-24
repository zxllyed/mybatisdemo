package com.zxlala.demo.mapper;

import com.zxlala.demo.pojo.Customer;
import com.zxlala.demo.pojo.LinkManCus;
import com.zxlala.demo.pojo.QueryVo;
import com.zxlala.demo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerMapperTest {

    @org.junit.Test
    public void queryCusById() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        Customer customer = customerMapper.queryCusById(1);
        System.out.println(customer);

        sqlSession.close();
    }

    @org.junit.Test
    public void queryCusByName() {

    }

    @org.junit.Test
    public void saveCus() {

    }

    @org.junit.Test
    public void getCusByQueryVo() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        QueryVo queryVo = new QueryVo();
        Customer customer = new Customer();
        customer.setCname("zx");
        queryVo.setCustomer(customer);
        List<Customer> list = customerMapper.getCusByQueryVo(queryVo);
        for (Customer customer1 : list) {
            System.out.println(customer1);
        }

        sqlSession.close();
    }

    @org.junit.Test
    public void queryCusCount(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        int count = customerMapper.queryCusCount();
        System.out.println(count);

        sqlSession.close();
    }

    @Test
    public void queryCusByIds() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        QueryVo queryVo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(6);
        queryVo.setIds(ids);
        List<Customer> list = customerMapper.queryCusByIds(queryVo);
        for (Customer customer : list) {
            System.out.println(customer);
        }

        sqlSession.close();
    }

    @Test
    public void queryLinkManCus() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        List<LinkManCus> list = customerMapper.queryLinkManCus();
        for (LinkManCus linkManCus : list) {
            System.out.println(linkManCus);
        }

        sqlSession.close();
    }
}