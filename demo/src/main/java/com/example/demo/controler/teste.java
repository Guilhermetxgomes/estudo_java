package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teste {

  @GetMapping("/")
  public String ola(){
    return "ola";
  }

}
