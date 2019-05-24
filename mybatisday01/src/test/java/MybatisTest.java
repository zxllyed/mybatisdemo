import com.zxlala.demo.mapper.CustomerMapper;
import com.zxlala.demo.pojo.Customer;
import com.zxlala.demo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testQueryCusById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = sqlSession.selectOne("queryCusById",1);
        System.out.println(customer);
        sqlSession.close();
    }

    @Test
    public void testQueryCusByName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Customer> list = sqlSession.selectList("queryCusByName","zx%");
        for (Customer customer:list) {
            System.out.println(customer);
        }
        sqlSession.close();
    }

    @Test
    public void testQueryCusByName2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Customer> list = sqlSession.selectList("user.queryCusByName2","zx");
        for (Customer customer:list) {
            System.out.println(customer);
        }
        sqlSession.close();
    }

    @Test
    public void testSaveCus(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = new Customer();
        customer.setCname("zxlalababaaba1123123");
        customer.setEmail("zxalalalala11231231@qq.com");
        sqlSession.insert("user.saveCus",customer);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSaveCus2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = new Customer();
        customer.setCname("zxlalababaaba1");
        customer.setEmail("zxalalalala1@qq.com");
        sqlSession.insert("user.saveCus2",customer);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateCusById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = new Customer();
        customer.setCid(4);
        customer.setCname("lk is a dog");
        customer.setEmail("lkdog@qq.com");
        sqlSession.update("user.updateCusById",customer);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteCusById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("user.deleteCusById",5);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testQueryCusById1(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.queryCusById(1);
        System.out.println(customer);
    }
}