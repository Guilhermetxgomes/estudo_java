package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;

@RestController
public class ClienteControler {


  @GetMapping(path = "/clientes/qualquer")
  public Cliente obterCliente() {

    return new Cliente(21,"Gui", "12341234");
  }
}
