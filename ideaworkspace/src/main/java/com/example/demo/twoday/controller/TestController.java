package com.example.demo.twoday.controller;

import com.example.demo.twoday.entity.Product;
import com.example.demo.twoday.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController

//有一条信息报错没插进去，信息就会回滚
@Transactional
public class TestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product/insertDouble")
    public void insert(){
        Product product1=new Product();
        product1.setName("巧克力");
        product1.setPrice(10);
        product1.setDescribe("好吃");
        productRepository.save(product1);

        Product product2=new Product();
        product2.setName("冰淇凌");
        product2.setPrice(5);
        product2.setDescribe("凉爽");
        productRepository.save(product2);
    }
}
