package services;

import exceptions.EntityNotFoundException;
import exceptions.InvalidOperationException;
import models.Cliente;
import models.Produto;
import models.Venda;
import repository.IRepository;

public class VendaService {
    private final IRepository<Venda> vendaRepository;
    private final IRepository<Cliente> clienteRepository;
    private final IRepository<Produto> produtoRepository;

    public VendaService(IRepository<Venda> vendaRepository,
                        IRepository<Cliente> clienteRepository,
                        IRepository<Produto> produtoRepository) {
        this.vendaRepository = vendaRepository;
        this.clienteRepository = clienteRepository;
        this.produtoRepository = produtoRepository;
    }

    public void realizarVenda(int clienteId, int produtoId)
            throws InvalidOperationException, EntityNotFoundException {
        try {
            Cliente cliente = clienteRepository.buscarPorId(clienteId);
            Produto produto = produtoRepository.buscarPorId(produtoId);

            if (!produto.isDisponivel()) {
                throw new InvalidOperationException("Produto não disponível para venda");
            }

            Venda venda = new Venda(0, cliente);
            produto.setDisponivel(false);
            vendaRepository.adicionar(venda);

        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Erro na venda: " + e.getMessage());
        } catch (Exception e) {
            throw new InvalidOperationException("Falha ao processar venda: " + e.getMessage());
        }
    }
}