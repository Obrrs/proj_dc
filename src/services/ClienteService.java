package services;

import exceptions.EntityNotFoundException;
import exceptions.InvalidOperationException;
import models.Cliente;
import repository.IRepository;

public class ClienteService {
    private final IRepository<Cliente> repository;

    public ClienteService(IRepository<Cliente> repository) {
        this.repository = repository;
    }

    public void cadastrarCliente(String nome, String telefone, String email)
            throws InvalidOperationException {
        try {
            Cliente cliente = new Cliente(0, nome, telefone, email);
            repository.adicionar(cliente);
        } catch (Exception e) {
            throw new InvalidOperationException("Falha ao cadastrar cliente: " + e.getMessage());
        }
    }

    public Cliente buscarCliente(int id) throws EntityNotFoundException {
        try {
            return repository.buscarPorId(id);
        } catch (Exception e) {
            throw new EntityNotFoundException("Cliente não encontrado: " + e.getMessage());
        }
    }

    // Outros métodos de serviço
}