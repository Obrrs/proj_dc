package mocks;

import models.Cliente;
import models.Jogo;
import repository.IRepository;

public class MockData {
    public static void popularClientes(IRepository<Cliente> repo) {
        try {
            repo.adicionar(new Cliente(1, "João Silva", "1111-2222", "joao@email.com"));
            repo.adicionar(new Cliente(2, "Maria Santos", "3333-4444", "maria@email.com"));
        } catch (Exception e) {
            System.out.println("Erro ao popular clientes mock: " + e.getMessage());
        }
    }

    public static void popularJogos(IRepository<Jogo> repo) {
        try {
            repo.adicionar(new Jogo(1, "Elden Ring", "RPG", 299.90, "PS5", "FromSoftware"));
            repo.adicionar(new Jogo(2, "FIFA 23", "Esporte", 249.90, "Xbox", "EA Sports"));
        } catch (Exception e) {
            System.out.println("Erro ao popular jogos mock: " + e.getMessage());
        }
    }
}