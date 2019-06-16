package bao.doan.spring.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bao.doan.spring.model.People;

@Repository 
public interface PeopleRepository extends CrudRepository<People, Long>{
  
}