package com.zxlala.demo.pojo;

import java.util.List;

public class QueryVo {
    private Customer customer;

    private List<Integer> ids;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
