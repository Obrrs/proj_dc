package models;

import java.time.LocalDate;

public class Cliente extends Pessoa {
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
    }
}