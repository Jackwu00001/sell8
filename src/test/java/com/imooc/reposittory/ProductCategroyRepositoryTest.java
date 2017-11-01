package com.imooc.reposittory;

import com.imooc.dataobject.ProductCategroy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by asus on 9/5/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategroyRepositoryTest {
    @Autowired
    private ProductCategroyRepository repository;
    @Test
    public void test(){
        ProductCategroy productCategroy = repository.findOne(1);
        System.out.println(productCategroy.toString());

    }
    @Test
    public void test1( ){
        ProductCategroy productCategroy = new ProductCategroy( );
        productCategroy.setCategroyId(1);
        productCategroy.setCategroyName("男生最爱");
        productCategroy.setCategroyType(3);
        repository.save(productCategroy);

    }

}