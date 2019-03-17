package cn.v2it.springboothello;

import cn.v2it.springboothello.domain.User;
import cn.v2it.springboothello.mapper.UserMapper;
import cn.v2it.springboothello.xqq.entity.Product;
import cn.v2it.springboothello.xqq.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: xqq
 * @Date: 2019/3/17 02:55
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
        User whx = User.builder().age(25).email("qq.com").name("whx").build();
        userMapper.insert(whx);
        userMapper.insert(User.builder().age(33).email("qq.com").name("other").build());
        Long id = whx.getId();
        System.out.println("=================id : " + id);
        System.out.println("==========" + userMapper.selectById(id));
        userMapper.deleteById(id);
    }

    @Test
    public void testProduct(){
//        productMapper.insert(Product.builder().name("aaa").build());
        List<Product> list = productMapper.selectList(null);
        list.forEach(System.out::println);
//        System.out.println(productMapper.selectById(1L));

    }

}