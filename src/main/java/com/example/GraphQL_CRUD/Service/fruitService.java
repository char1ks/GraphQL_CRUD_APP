package com.example.GraphQL_CRUD.Service;

import com.example.GraphQL_CRUD.Model.fruit;
import com.example.GraphQL_CRUD.Repository.fruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class fruitService {
    @Autowired
    private fruitRepository operations;

    public List<fruit> getAll(Integer count){
        if (count != null && count > 0) {
            return operations.findAll().stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
        return operations.findAll();
    }
    public fruit getConcreteFruit(int id){
        return operations.findById(id).orElse(null);
    }
    public fruit saveFruit(String type,String price){
        return operations.save(new fruit(type,price));
    }
}
