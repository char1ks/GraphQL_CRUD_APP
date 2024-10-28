package com.example.GraphQL_CRUD.Query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.GraphQL_CRUD.Model.fruit;
import com.example.GraphQL_CRUD.Service.fruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class fruitQuery implements GraphQLQueryResolver {

    @Autowired
    public fruitService operations;

    public List<fruit> allFruits(Integer count){
        return operations.getAll(count);
    }
    public fruit concreteFruit(int id){
        return operations.getConcreteFruit(id);
    }

}
