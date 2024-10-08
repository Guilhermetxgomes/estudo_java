package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entities.Produto;
import com.example.demo.model.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

  @Autowired
  private ProdutoRepository produtoRepository;

  @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
  public Produto salvarProduto (@Valid Produto produto) {
    produtoRepository.save(produto);
    return produto;
  }

  @GetMapping
  public Iterable<Produto> obterProdutos() {
    return produtoRepository.findAll();
  }

  @GetMapping("/pagina/{numeroPagina}")
  public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina) {
    Pageable page = PageRequest.of(numeroPagina,1);
    return produtoRepository.findAll(page);
  }

  @GetMapping("/nome/{parteNome}")
  public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
    return produtoRepository.searchByNameLike(parteNome);
  }

  @GetMapping("/{id}")
  public Optional<Produto> obterProdutoPorId(@PathVariable int id){
    return produtoRepository.findById(id);
  }


  // @PutMapping()
  // public Produto alterarProduto(@Valid Produto produto) {
  //   produtoRepository.save(produto);
  //   return produto;
  // }

  @DeleteMapping("/{id}")
  public void excluirProduto(@PathVariable int id) {
    produtoRepository.deleteById(id);
  }

}
