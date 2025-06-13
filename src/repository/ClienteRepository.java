package repository;

import exceptions.DataAccessException;
import exceptions.EntityNotFoundException;
import models.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteRepository implements IRepository<Cliente> {
    private final Map<Integer, Cliente> clientes = new HashMap<>();
    private int nextId = 1;

    @Override
    public void adicionar(Cliente cliente) throws DataAccessException {
        try {
            cliente.setId(nextId++);
            clientes.put(cliente.getId(), cliente);
        } catch (Exception e) {
            throw new DataAccessException("Erro ao adicionar cliente", e);
        }
    }

    @Override
    public Cliente buscarPorId(int id) throws EntityNotFoundException, DataAccessException {
        Cliente cliente = clientes.get(id);
        if (cliente == null) {
            throw new EntityNotFoundException("Cliente com ID " + id + " não encontrado");
        }
        return cliente;
    }

    @Override
    public List<Cliente> listarTodos() throws DataAccessException {
        return new ArrayList<>(clientes.values());
    }

    @Override
    public void atualizar(Cliente item) throws EntityNotFoundException, DataAccessException {
        if (!clientes.containsKey(item.getId())) {
            throw new EntityNotFoundException("Cliente não encontrado para atualização");
        }
        clientes.put(item.getId(), item);
    }

    @Override
    public void remover(int id) throws EntityNotFoundException, DataAccessException {
        if (!clientes.containsKey(id)) {
            throw new EntityNotFoundException("Cliente não encontrado para remoção");
        }
        clientes.remove(id);
    }
}