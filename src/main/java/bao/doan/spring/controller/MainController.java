package bao.doan.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import bao.doan.spring.model.People;
import bao.doan.spring.service.PeopleService;

@RestController
@RequestMapping("/")
public class MainController {

  @Autowired
  PeopleService peopleService;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<People> getPeople() {
    return peopleService.getPeople();
  }
}
