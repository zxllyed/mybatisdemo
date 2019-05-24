package com.zxlala.demo.mapper;

import com.zxlala.demo.pojo.LinkMan;
import com.zxlala.demo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LinkManMapperTest {

    @Test
    public void getLinkManListMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        LinkManMapper linkManMapper = sqlSession.getMapper(LinkManMapper.class);

        List<LinkMan> list = linkManMapper.getLinkManListMap();
        for (LinkMan linkMan : list) {
            System.out.println(linkMan);
        }

        sqlSession.close();
    }

    @Test
    public void queryCusByWhere() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        LinkManMapper linkManMapper = sqlSession.getMapper(LinkManMapper.class);

        LinkMan linkMan = new LinkMan();
        linkMan.setLink_name("TK");
        linkMan.setLink_age("11");

        List<LinkMan> list = linkManMapper.queryCusByWhere(linkMan);
        for (LinkMan man : list) {
            System.out.println(man);
        }

        sqlSession.close();
    }

    @Test
    public void queryCusByWhere2() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        LinkManMapper linkManMapper = sqlSession.getMapper(LinkManMapper.class);

        LinkMan linkMan = new LinkMan();
        linkMan.setLink_name("TK");
        linkMan.setLink_age("11");

        List<LinkMan> list = linkManMapper.queryCusByWhere2(linkMan);
        for (LinkMan man : list) {
            System.out.println(man);
        }

        sqlSession.close();
    }

    @Test
    public void queryCusByWhere3() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        LinkManMapper linkManMapper = sqlSession.getMapper(LinkManMapper.class);

        LinkMan linkMan = new LinkMan();
        linkMan.setLink_name("TK");

        List<LinkMan> list = linkManMapper.queryCusByWhere3(linkMan);
        for (LinkMan man : list) {
            System.out.println(man);
        }

        sqlSession.close();
    }
}