package repository;

import exceptions.DataAccessException;
import exceptions.EntityNotFoundException;
import models.Produto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository implements IRepository<Produto> {
    private final Map<Integer, Produto> produtos = new HashMap<>();
    private int nextId = 1;

    @Override
    public void adicionar(Produto produto) throws DataAccessException {
        try {
            produto.setCodigo(nextId++);
            produtos.put(produto.getCodigo(), produto);
        } catch (Exception e) {
            throw new DataAccessException("Erro ao adicionar produto", e);
        }
    }

    @Override
    public Produto buscarPorId(int id) throws EntityNotFoundException, DataAccessException {
        Produto produto = produtos.get(id);
        if (produto == null) {
            throw new EntityNotFoundException("Produto com ID " + id + " não encontrado");
        }
        return produto;
    }

    @Override
    public List<Produto> listarTodos() throws DataAccessException {
        return new ArrayList<>(produtos.values());
    }

    @Override
    public void atualizar(Produto item) throws EntityNotFoundException, DataAccessException {
        if (!produtos.containsKey(item.getCodigo())) {
            throw new EntityNotFoundException("Produto não encontrado para atualização");
        }
        produtos.put(item.getCodigo(), item);
    }

    @Override
    public void remover(int id) throws EntityNotFoundException, DataAccessException {
        if (!produtos.containsKey(id)) {
            throw new EntityNotFoundException("Produto não encontrado para remoção");
        }
        produtos.remove(id);
    }
}