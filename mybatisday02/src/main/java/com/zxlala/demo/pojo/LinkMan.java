package com.zxlala.demo.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    @Override
    public String toString() {
        return "LinkMan{" +
                "Link_id=" + Link_id +
                ", Link_name='" + Link_name + '\'' +
                ", Link_age='" + Link_age + '\'' +
                '}';
    }
}
