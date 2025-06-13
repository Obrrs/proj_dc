package views;

import java.util.Scanner;

public class VendaView {
    private final Scanner scanner;

    public VendaView() {
        scanner = new Scanner(System.in);
    }

    public int[] obterIdsVenda() {
        System.out.println("\n--- REALIZAR VENDA ---");
        System.out.print("ID do Cliente: ");
        int clienteId = Integer.parseInt(scanner.nextLine());
        System.out.print("ID do Produto: ");
        int produtoId = Integer.parseInt(scanner.nextLine());
        return new int[]{clienteId, produtoId};
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println("\n[INFO] " + mensagem);
    }

    public void mostrarErro(String erro) {
        System.err.println("\n[ERRO] " + erro);
    }
}