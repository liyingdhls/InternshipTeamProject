package com.example.demo.twoday.controller;


import com.example.demo.twoday.repository.ProductRepository;
import com.example.demo.twoday.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ProductController {
    @Autowired
    private ProductRepository repository;

    /**1.获取产品所有信息*/
    @GetMapping("/product")//Get请求

    public List<Product> getAll(){
        return (List<Product>) repository.findAll();
    }

    /**2.创建一条产品信息*/
    @PostMapping("/product")

    public Product create(@RequestParam("name")String name,@RequestParam("price")Double price,@RequestParam("describe")String describe){
        Product product=new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescribe(describe);

        return repository.save(product);
    }

    /**3.通过id查找产品信息*/
    @GetMapping("/product/{id}")
    public Product findById(@PathVariable("id")Integer id){
        return repository.findById(id).orElse(null);
    }

    /**4.通过id更新产品信息*/
    @PutMapping("/product/{id}")
    public Product update(@PathVariable("id")Integer id,@RequestParam(value = "name",required = false)String name,
                          @RequestParam(value = "price",required = false)Double price,@RequestParam(value = "describe",required = false)String describe){
        Optional<Product> optional= repository.findById(id);
        Product product;
        if(optional.isPresent()){
            product=optional.get();
        }else {
            return null;
        }
        if(name!=null){
            product.setName(name);
        }
        if(price!=null){
            product.setPrice(price);
        }
        if(describe!=null){
            product.setDescribe(describe);
        }
        return repository.save(product);
    }

    /**5.通过id删除产品信息*/
    @DeleteMapping("/product//{id}")
    public String delete(@PathVariable("id")Integer id) {
        Optional<Product> ptional = repository.findById(id);
        Product p;
        if (ptional.isPresent()) {
            p = ptional.get();
            repository.delete(p);
            return "删除成功";
        } else {
            return "id不存在";
        }
    }
}
