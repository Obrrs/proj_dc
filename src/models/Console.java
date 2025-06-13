package models;

public class Console extends Produto {
    private String fabricante;
    private String capacidade;

    public Console(int codigo, String titulo, String genero, double preco,
                   String fabricante, String capacidade) {
        super(codigo, titulo, genero, preco);
        this.fabricante = fabricante;
        this.capacidade = capacidade;
    }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getCapacidade() { return capacidade; }
    public void setCapacidade(String capacidade) { this.capacidade = capacidade; }

    @Override
    public String toString() {
        return "[CONSOLE] " + super.toString() + " | Fabricante: " + fabricante +
                " | Capacidade: " + capacidade;
    }
}