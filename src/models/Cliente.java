package models;

import java.time.LocalDate;

public class Cliente extends Pessoa {
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
    }
}