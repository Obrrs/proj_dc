package models;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> c88f66b7ade30244c0a0d7dacb3a951e81502d6d

public class Venda {
    private int id;
    private Cliente cliente;
<<<<<<< HEAD
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
=======
    private Produto produto;
    private LocalDate data;
    private double valor;

    public Venda(int id, Cliente cliente, Produto produto) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.data = LocalDate.now();
        this.valor = produto.getPreco();
>>>>>>> c88f66b7ade30244c0a0d7dacb3a951e81502d6d
    }

    // Getters
    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
<<<<<<< HEAD
    public List<Produto> getProdutos() { return produtos; }
    public LocalDate getData() { return data; }
    public double getValorTotal() { return valorTotal; }
    public double getDesconto() { return desconto; }

    @Override
    public String toString() {
        return "Venda #" + id + " | Cliente: " + cliente.getNome() +
                " | Data: " + data + " | Total: R$" + valorTotal +
                " | Produtos: " + produtos.size();
=======
    public Produto getProduto() { return produto; }
    public LocalDate getData() { return data; }
    public double getValor() { return valor; }

    @Override
    public String toString() {
        return id + " | " + data + " | " + cliente.getNome() + " | " +
                produto.getTitulo() + " | R$" + valor;
    }

    public void setId(int id) {
        this.id = id;
>>>>>>> c88f66b7ade30244c0a0d7dacb3a951e81502d6d
    }
}