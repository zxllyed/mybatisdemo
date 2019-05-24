package com.zxlala.demo.pojo;

import java.io.Serializable;

public class LinkMan implements Serializable {
    private Integer Link_id;
    private String Link_name;
    private String Link_age;

    public Integer getLink_id() {
        return Link_id;
    }

    public void setLink_id(Integer link_id) {
        Link_id = link_id;
    }

    public String getLink_name() {
        return Link_name;
    }

    public void setLink_name(String link_name) {
        Link_name = link_name;
    }

    public String getLink_age() {
        return Link_age;
    }

    public void setLink_age(String link_age) {
        Link_age = link_age;
    }
}
