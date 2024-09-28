package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {


  @GetMapping(path = "/qualquer")
  public Cliente obterCliente() {

    return new Cliente(21,"Gui", "12341234");
  }

  @GetMapping("/{id}")
  public Cliente obterClientePorId1(@PathVariable int id) {
    return new Cliente(id, "Maria", "131232131");
  }


  @GetMapping
  public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
    return new Cliente(id, "Joao ", "321231321");
  }
}
