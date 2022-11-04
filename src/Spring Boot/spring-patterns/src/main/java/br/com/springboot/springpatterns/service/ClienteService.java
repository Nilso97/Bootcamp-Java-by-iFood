package br.com.springboot.springpatterns.service;

import br.com.springboot.springpatterns.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}

