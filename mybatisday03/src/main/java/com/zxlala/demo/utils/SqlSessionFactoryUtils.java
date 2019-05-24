package com.zxlala.demo.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            sqlSessionFactory = ssfb.build(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
