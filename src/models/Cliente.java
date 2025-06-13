package models;

import java.time.LocalDate;

public class Cliente extends Pessoa {
<<<<<<< HEAD
    private int id;
    private String nif;

    public Cliente() {}

    public Cliente(int id, String nome, String email, String nif) {
        super(nome, email);
        this.id = id;
        this.nif = nif;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", nif='" + nif + '\'' +
                '}';
=======
    private LocalDate dataRegistro;
    private boolean status;

    public Cliente(int id, String nome, String telefone, String email) {
        super(id, nome, telefone, email);
        this.dataRegistro = LocalDate.now();
        this.status = true;
    }

    public LocalDate getDataRegistro() { return dataRegistro; }
    public boolean isStatus() { return status; }
    public void bloquear() { status = false; }
    public void ativar() { status = true; }

    @Override
    public String toString() {
        return id + " | " + nome + " | " + email + " | " +
                (status ? "Ativo" : "Bloqueado");
    }

    public void setId(int id) {
        this.id = id;
>>>>>>> c88f66b7ade30244c0a0d7dacb3a951e81502d6d
    }
}