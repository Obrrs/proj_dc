package repository;

import exceptions.DataAccessException;
import exceptions.EntityNotFoundException;
import models.Venda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendaRepository implements IRepository<Venda> {
    private final Map<Integer, Venda> vendas = new HashMap<>();
    private int nextId = 1;

    @Override
    public void adicionar(Venda venda) throws DataAccessException {
        try {
            venda.setId(nextId++);
            vendas.put(venda.getId(), venda);
        } catch (Exception e) {
            throw new DataAccessException("Erro ao registrar venda", e);
        }
    }

    @Override
    public Venda buscarPorId(int id) throws EntityNotFoundException, DataAccessException {
        Venda venda = vendas.get(id);
        if (venda == null) {
            throw new EntityNotFoundException("Venda com ID " + id + " não encontrada");
        }
        return venda;
    }

    @Override
    public List<Venda> listarTodos() throws DataAccessException {
        return new ArrayList<>(vendas.values());
    }

    @Override
    public void atualizar(Venda item) throws EntityNotFoundException, DataAccessException {
        if (!vendas.containsKey(item.getId())) {
            throw new EntityNotFoundException("Venda não encontrada para atualização");
        }
        vendas.put(item.getId(), item);
    }

    @Override
    public void remover(int id) throws EntityNotFoundException, DataAccessException {
        if (!vendas.containsKey(id)) {
            throw new EntityNotFoundException("Venda não encontrada para remoção");
        }
        vendas.remove(id);
    }
}