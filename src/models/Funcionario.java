package models;

public class Funcionario extends Pessoa {
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
    }
}