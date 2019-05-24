import com.zxlala.demo.mapper.CustomerMapper;
import com.zxlala.demo.pojo.Customer;
import com.zxlala.demo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CustomerMapperTestTest {

    @Test
    public void testQueryCusById(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.queryCusById(1);
        System.out.println(customer);
    }

    @Test
    public void testqueryCusByName(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> list = customerMapper.queryCusByName("zx%");
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    @Test
    public void testInsertCus(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setCname("zxhaha");
        customer.setEmail("zxhaha@qq.com");
        customerMapper.saveCus(customer);
        sqlSession.commit();
        sqlSession.close();
    }
}