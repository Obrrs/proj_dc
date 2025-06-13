package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente;
    private List<Produto> produtos;
    private LocalDate data;
    private double valorTotal;
    private double desconto;

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.data = LocalDate.now();
        this.valorTotal = 0;
        this.desconto = 0;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public void aplicarDesconto(double desconto) {
        this.desconto = desconto;
        valorTotal -= desconto;
    }

    // Getters
    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public List<Produto> getProdutos() { return produtos; }
    public LocalDate getData() { return data; }
    public double getValorTotal() { return valorTotal; }
    public double getDesconto() { return desconto; }

    @Override
    public String toString() {
        return "Venda #" + id + " | Cliente: " + cliente.getNome() +
                " | Data: " + data + " | Total: R$" + valorTotal +
                " | Produtos: " + produtos.size();
    }
}