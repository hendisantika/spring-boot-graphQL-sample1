package com.hendisantika.graphql.springbootgraphqlsample1.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql-sample1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-11-30
 * Time: 05:20
 * To change this template use File | Settings | File Templates.
 */

@Data
public class Person {
    @Id
    private int id;
    private String name;
    private String mobile;
    private String email;
    private String[] address;
}
