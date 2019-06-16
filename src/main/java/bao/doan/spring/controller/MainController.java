package bao.doan.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bao.doan.spring.model.People;
import bao.doan.spring.repository.PeopleRepository;

@RestController
@RequestMapping("/")
public class MainController {

  @Autowired
  PeopleRepository repository;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<People> getTest() {
    return (List<People>) repository.findAll();
  }
}
