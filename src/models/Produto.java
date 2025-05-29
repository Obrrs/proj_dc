package models;

public abstract class Produto {
    protected int codigo;
    protected String titulo;
    protected String genero;
    protected double preco;
    protected boolean disponivel;

    public Produto(int codigo, String titulo, String genero, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.preco = preco;
        this.disponivel = true;
    }

    // Getters e Setters
    public int getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public double getPreco() { return preco; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}