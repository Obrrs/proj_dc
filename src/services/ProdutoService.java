package services;

import exceptions.EntityNotFoundException;
import exceptions.InvalidOperationException;
import models.Jogo;
import models.Produto;
import repository.IRepository;

public class ProdutoService {
    private final IRepository<Produto> repository;

    public ProdutoService(IRepository<Produto> repository) {
        this.repository = repository;
    }

    public void cadastrarJogo(String titulo, String genero, double preco,
                              String plataforma, String desenvolvedora)
            throws InvalidOperationException {
        try {
            Jogo jogo = new Jogo(0, titulo, genero, preco, plataforma, desenvolvedora);
            repository.adicionar(jogo);
        } catch (Exception e) {
            throw new InvalidOperationException("Falha ao cadastrar jogo: " + e.getMessage());
        }
    }

    public Produto buscarProduto(int id) throws EntityNotFoundException {
        try {
            return repository.buscarPorId(id);
        } catch (Exception e) {
            throw new EntityNotFoundException("Produto não encontrado: " + e.getMessage());
        }
    }
}