package models;

public class Funcionario extends Pessoa {
    private String matricula;

    public Funcionario() {}

    public Funcionario(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}