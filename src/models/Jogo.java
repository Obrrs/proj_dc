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
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String getDesenvolvedora() { return desenvolvedora; }
    public void setDesenvolvedora(String desenvolvedora) { this.desenvolvedora = desenvolvedora; }

    @Override
    public String toString() {
        return "[JOGO] " + super.toString() + " | Plataforma: " + plataforma +
                " | Desenvolvedora: " + desenvolvedora;
    }
}