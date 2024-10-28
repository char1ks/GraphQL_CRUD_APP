package com.example.GraphQL_CRUD.Repository;

import com.example.GraphQL_CRUD.Model.fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fruitRepository extends JpaRepository<fruit,Integer> {
}
