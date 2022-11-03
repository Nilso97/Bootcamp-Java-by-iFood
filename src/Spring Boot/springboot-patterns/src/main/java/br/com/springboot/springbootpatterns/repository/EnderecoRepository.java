package br.com.springboot.springbootpatterns.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import br.com.springboot.springbootpatterns.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
