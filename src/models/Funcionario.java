package models;

public class Funcionario extends Pessoa {
<<<<<<< HEAD
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
=======
    private String cargo;
    private double salario;

    public Funcionario(int id, String nome, String telefone, String email, String cargo, double salario) {
        super(id, nome, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return id + " | " + nome + " | " + cargo + " | R$" + salario;
>>>>>>> c88f66b7ade30244c0a0d7dacb3a951e81502d6d
    }
}