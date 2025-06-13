package views;

import java.util.Scanner;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMenuPrincipal() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Clientes");
        System.out.println("2. Produtos");
        System.out.println("3. Vendas");
        System.out.println("0. Sair");
    }

    public void mostrarMenuClientes() {
        System.out.println("\n=== MENU CLIENTES ===");
        System.out.println("1. Listar clientes");
        System.out.println("2. Adicionar cliente");
        System.out.println("0. Voltar");
    }

    public void mostrarMenuProdutos() {
        System.out.println("\n=== MENU PRODUTOS ===");
        System.out.println("1. Listar produtos");
        System.out.println("2. Adicionar produto");
        System.out.println("0. Voltar");
    }

    public void mostrarMenuVendas() {
        System.out.println("\n=== MENU VENDAS ===");
        System.out.println("1. Listar vendas");
        System.out.println("2. Nova venda");
        System.out.println("0. Voltar");
    }

    public int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            // Se o utilizador não escrever um número, devolve -1, que vai cair no default do switch
            return -1;
        }
    }

    // Menu principal
    public void menuPrincipal() {
        int opcao;
        do {
            mostrarMenuPrincipal();
            opcao = lerOpcao();
            System.out.println("DEBUG: opcao = " + opcao); // Podes remover isto depois de testar
            switch (opcao) {
                case 1:
                    menuClientes();
                    break;
                case 2:
                    menuProdutos();
                    break;
                case 3:
                    menuVendas();
                    break;
                case 0:
                    System.out.println("A sair do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Menu de clientes
    public void menuClientes() {
        int opcao;
        do {
            mostrarMenuClientes();
            opcao = lerOpcao();
            System.out.println("DEBUG: opcao (clientes) = " + opcao); // Podes remover depois de testar
            switch (opcao) {
                case 1:
                    System.out.println("Listar clientes (exemplo)");
                    break;
                case 2:
                    System.out.println("Adicionar cliente (exemplo)");
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Menu de produtos
    public void menuProdutos() {
        int opcao;
        do {
            mostrarMenuProdutos();
            opcao = lerOpcao();
            System.out.println("DEBUG: opcao (produtos) = " + opcao); // Podes remover depois de testar
            switch (opcao) {
                case 1:
                    System.out.println("Listar produtos (exemplo)");
                    break;
                case 2:
                    System.out.println("Adicionar produto (exemplo)");
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Menu de vendas
    public void menuVendas() {
        int opcao;
        do {
            mostrarMenuVendas();
            opcao = lerOpcao();
            System.out.println("DEBUG: opcao (vendas) = " + opcao); // Podes remover depois de testar
            switch (opcao) {
                case 1:
                    System.out.println("Listar vendas (exemplo)");
                    break;
                case 2:
                    System.out.println("Nova venda (exemplo)");
                    break;
                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}