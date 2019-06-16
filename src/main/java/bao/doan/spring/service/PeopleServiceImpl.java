package bao.doan.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bao.doan.spring.model.People;
import bao.doan.spring.repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService {

  @Autowired
  PeopleRepository peopleRepository;

  @Override
  public List<People> getPeople() { 
    return (List<People>) peopleRepository.findAll();
  }

}
