package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class metodoHTTPControler {


  @GetMapping
  public String get() {
    return "Requisição GET";
  }

  @PostMapping
  public String post() {
    return "Requisição post";
  }

  @PutMapping
  public String put() {
    return "Requisição put";
  }

  @PatchMapping
  public String patch() {
    return "Requisição patch";
  }

  @DeleteMapping
  public String delete() {
    return "Requisição delete";
  }

}
