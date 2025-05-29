package models;

public class Jogo extends Produto {
    private String plataforma;
    private String desenvolvedora;

    public Jogo(int codigo, String titulo, String genero, double preco,
                String plataforma, String desenvolvedora) {
        super(codigo, titulo, genero, preco);
        this.plataforma = plataforma;
        this.desenvolvedora = desenvolvedora;
    }

    public String getPlataforma() { return plataforma; }
    public String getDesenvolvedora() { return desenvolvedora; }

    @Override
    public String toString() {
        return codigo + " | " + titulo + " | " + plataforma + " | R$" + preco +
                " | " + (disponivel ? "Disponível" : "Vendido");
    }
}