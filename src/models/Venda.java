package models;

import java.time.LocalDate;

public class Venda {
    private int id;
    private Cliente cliente;
    private Produto produto;
    private LocalDate data;
    private double valor;

    public Venda(int id, Cliente cliente, Produto produto) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.data = LocalDate.now();
        this.valor = produto.getPreco();
    }

    // Getters
    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
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
    }
}