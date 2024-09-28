package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/calculadora")
@RestController
public class CalculadoraControler {


  // /calculadora/somar/10/20
  // calculadora/subtrair?a=100&b=20


  @GetMapping("/somar/{a}/{b}")
  public int somar(@PathVariable int a, @PathVariable int b) {
    return a + b;
  }

  @GetMapping("/subtrair")
  public int subtrair(@RequestParam(name ="a") int a, @RequestParam(name = "b") int b) {
    return a - b;
  }


}
