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
<<<<<<< HEAD
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String getDesenvolvedora() { return desenvolvedora; }
    public void setDesenvolvedora(String desenvolvedora) { this.desenvolvedora = desenvolvedora; }

    @Override
    public String toString() {
        return "[JOGO] " + super.toString() + " | Plataforma: " + plataforma +
                " | Desenvolvedora: " + desenvolvedora;
=======
    public String getDesenvolvedora() { return desenvolvedora; }

    @Override
    public String toString() {
        return codigo + " | " + titulo + " | " + plataforma + " | R$" + preco +
                " | " + (disponivel ? "Disponível" : "Vendido");
>>>>>>> c88f66b7ade30244c0a0d7dacb3a951e81502d6d
    }
}