package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entities.Produto;
import com.example.demo.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

  @Autowired
  private ProdutoRepository produtoRepository;

  @PostMapping
  public Produto novoProduto(Produto produto) {
    produtoRepository.save(produto);
    return produto;
  }

}
