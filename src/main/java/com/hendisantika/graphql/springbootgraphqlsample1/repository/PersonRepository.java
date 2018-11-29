package com.hendisantika.graphql.springbootgraphqlsample1.repository;

import com.hendisantika.graphql.springbootgraphqlsample1.entity.Person;
import org.springframework.data.repository.CrudRepository;

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
public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findByEmail(String email);

}