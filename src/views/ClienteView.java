package views;

import java.util.Scanner;

public class ClienteView {
    private final Scanner scanner;

    public ClienteView() {
        scanner = new Scanner(System.in);
    }

    public String[] obterDadosCliente() {
        System.out.println("\n--- CADASTRO DE CLIENTE ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        return new String[]{nome, telefone, email};
    }

    public int obterIdCliente() {
        System.out.print("\nID do Cliente: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println("\n[INFO] " + mensagem);
    }

    public void mostrarErro(String erro) {
        System.err.println("\n[ERRO] " + erro);
    }
}