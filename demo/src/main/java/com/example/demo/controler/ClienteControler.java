package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;

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
}
