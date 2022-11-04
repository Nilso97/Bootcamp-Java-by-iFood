package br.com.springboot.springbootdesignpatterns.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.springbootdesignpatterns.model.Cliente;
import br.com.springboot.springbootdesignpatterns.model.Endereco;
import br.com.springboot.springbootdesignpatterns.repository.ClienteRepository;
import br.com.springboot.springbootdesignpatterns.repository.EnderecoRepository;
import br.com.springboot.springbootdesignpatterns.service.ClienteService;
import br.com.springboot.springbootdesignpatterns.service.ViaCepService;

@Service
public class ClienteServiceImplementation implements ClienteService {

    /**
     * 
     * @SingletonPattern
     * @DependecyInjection with Autowired
     * 
     */
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    /**
     * 
     * @StrategyPattern with auto implements methods
     * 
     */
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }
    
    // Extracted Method
    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
