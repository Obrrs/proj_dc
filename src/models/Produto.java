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
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    @Override
    public String toString() {
        return "Código: " + codigo + " | " + titulo + " | Gênero: " + genero +
                " | Preço: R$" + preco + " | " + (disponivel ? "Disponível" : "Indisponível");
    }
}