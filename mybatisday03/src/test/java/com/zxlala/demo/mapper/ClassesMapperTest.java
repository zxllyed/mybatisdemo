package com.zxlala.demo.mapper;

import com.zxlala.demo.pojo.Classes;
import com.zxlala.demo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassesMapperTest {

    @org.junit.Test
    public void getClass1() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);

        Classes class1 = classesMapper.getClass1(1);
        System.out.println(class1);

        sqlSession.close();
    }

    @Test
    public void getClass2() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);

        Classes class1 = classesMapper.getClass2(1);
        System.out.println(class1);

        sqlSession.close();
    }

    @Test
    public void getClass3() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);

        Classes class1 = classesMapper.getClass3(1);
        System.out.println(class1);

        sqlSession.close();
    }
}