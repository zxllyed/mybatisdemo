package com.zxlala.demo.mapper;

import com.zxlala.demo.pojo.Customer;
import com.zxlala.demo.pojo.LinkManCus;
import com.zxlala.demo.pojo.QueryVo;

import java.util.List;

public interface CustomerMapper {
    Customer queryCusById(Integer id);

    List<Customer> queryCusByName(String name);

    void saveCus(Customer customer);

    List<Customer> getCusByQueryVo(QueryVo queryVo);

    int queryCusCount();

    List<Customer> queryCusByIds(QueryVo queryVo);

    List<LinkManCus> queryLinkManCus();
}
