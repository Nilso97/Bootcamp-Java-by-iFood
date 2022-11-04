package br.com.springboot.springbootdesignpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.springbootdesignpatterns.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}

