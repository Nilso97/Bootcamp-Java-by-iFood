package br.com.springboot.springbootdesignpatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.springbootdesignpatterns.model.Cliente;
import br.com.springboot.springbootdesignpatterns.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {
    
    /**
     * 
     * @SingletonPattern
     *        +
     * @StrategyPattern
     *        =
     * @DependecyInjection with Autowired
     * 
     */
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(Cliente cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(Long id, Cliente cliente) {
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    public ResponseEntity<Cliente> deletar(Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
