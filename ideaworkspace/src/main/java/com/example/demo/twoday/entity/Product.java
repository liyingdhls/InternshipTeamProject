package com.example.demo.twoday.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//注解：证明这是一个实体类
@Entity

public class Product {
    @Id
    @GeneratedValue

    private Integer id;//产品id

    private String name;//产品名称

    private Double price;//产品价格

    private String describe;//产品描述
    public Product() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
