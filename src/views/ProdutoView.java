package views;


import java.util.Scanner;

public class ProdutoView {
    private final Scanner scanner;

    public ProdutoView() {
        scanner = new Scanner(System.in);
    }

    public String[] obterDadosJogo() {
        System.out.println("\n--- CADASTRO DE JOGO ---");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Preço: ");
        String preco = scanner.nextLine();
        System.out.print("Plataforma: ");
        String plataforma = scanner.nextLine();
        System.out.print("Desenvolvedora: ");
        String desenvolvedora = scanner.nextLine();
        return new String[]{titulo, genero, preco, plataforma, desenvolvedora};
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println("\n[INFO] " + mensagem);
    }

    public void mostrarErro(String erro) {
        System.err.println("\n[ERRO] " + erro);
    }
}