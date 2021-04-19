package com.example.demo.twoday.controller;

import com.example.demo.twoday.entity.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class ProductControllerTest {

    @Autowired
    private ProductController controller;
    @Test
    void getAll() {
        Assert.assertNotNull(controller.getAll());
        System.out.println("测试通过");
    }

    @Test
    void create() {
        Product p=new Product();
        p=controller.create("袜子",5.0,"清新小短袜");

    }

    @Test
    void findById() {
        Assert.assertNotEquals(null,controller.findById(1));
        System.out.println("测试通过");
    }

    @Test
    void update() {
        controller.update(2,"火龙果",8.5,"wu");
        Assert.assertNotEquals(null,controller.findById(2));
    }

    @Test
    void delete() {
        controller.delete(1);
        Assert.assertEquals(null,controller.findById(1));

    }
}
