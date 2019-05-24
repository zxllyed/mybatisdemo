package com.zxlala.demo.mapper;

import com.zxlala.demo.pojo.LinkMan;

import java.util.List;

public interface LinkManMapper {
    List<LinkMan> getLinkManListMap();

    List<LinkMan> queryCusByWhere(LinkMan linkMan);

    List<LinkMan> queryCusByWhere2(LinkMan linkMan);

    List<LinkMan> queryCusByWhere3(LinkMan linkMan);
}
