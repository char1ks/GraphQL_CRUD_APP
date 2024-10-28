package com.example.GraphQL_CRUD.Mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.GraphQL_CRUD.Model.fruit;
import com.example.GraphQL_CRUD.Service.fruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class fruitMutation implements GraphQLMutationResolver {
    @Autowired
    private fruitService operations;

    public fruit createFruit(String type,String price){
        return operations.saveFruit(type,price);
    }
}
