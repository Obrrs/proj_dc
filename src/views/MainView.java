package views;

import java.util.Scanner;

public class MainView {
    private final Scanner scanner;

    public MainView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        System.out.println("\n=== LOJA DE JOGOS ===");
        System.out.println("1. Clientes");
        System.out.println("2. Produtos");
        System.out.println("3. Vendas");
        System.out.println("4. Sair");
        System.out.print("Escolha: ");
    }

    public void mostrarMenuClientes() {
        System.out.println("\n--- MENU CLIENTES ---");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Buscar Cliente");
        System.out.println("3. Voltar");
        System.out.print("Escolha: ");
    }

    public void mostrarMenuProdutos() {
        System.out.println("\n--- MENU PRODUTOS ---");
        System.out.println("1. Cadastrar Jogo");
        System.out.println("2. Voltar");
        System.out.print("Escolha: ");
    }

    public void mostrarMenuVendas() {
        System.out.println("\n--- MENU VENDAS ---");
        System.out.println("1. Realizar Venda");
        System.out.println("2. Voltar");
        System.out.print("Escolha: ");
    }

    public int lerOpcao() {
        return Integer.parseInt(scanner.nextLine());
    }
}