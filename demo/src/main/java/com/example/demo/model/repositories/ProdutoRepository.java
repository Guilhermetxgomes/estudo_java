package com.example.demo.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.entities.Produto;


public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto,Integer> {

  public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

  @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
  public Iterable<Produto> searchByNameLike(@Param("nome") String nome);

}
