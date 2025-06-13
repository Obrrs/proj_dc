package models;

public class Acessorio extends Produto {
    private String tipo;
    private String compatibilidade;

    public Acessorio(int codigo, String titulo, String genero, double preco,
                     String tipo, String compatibilidade) {
        super(codigo, titulo, genero, preco);
        this.tipo = tipo;
        this.compatibilidade = compatibilidade;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getCompatibilidade() { return compatibilidade; }
    public void setCompatibilidade(String compatibilidade) { this.compatibilidade = compatibilidade; }

    @Override
    public String toString() {
        return "[ACESSÓRIO] " + super.toString() + " | Tipo: " + tipo + " | Compatível com: " + compatibilidade;
    }
}