import controllers.ClienteController;
import controllers.ProdutoController;
import controllers.VendaController;
import repository.ClienteRepository;
import repository.ProdutoRepository;
import repository.VendaRepository;
import services.ClienteService;
import services.ProdutoService;
import services.VendaService;
import views.ClienteView;
import views.MainView;
import views.ProdutoView;
import views.VendaView;
import models.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Inicialização de repositórios
        ClienteRepository clienteRepo = new ClienteRepository();
        ProdutoRepository produtoRepo = new ProdutoRepository();
        VendaRepository vendaRepo = new VendaRepository();

        // Inicialização de serviços
        ClienteService clienteService = new ClienteService(clienteRepo);
        ProdutoService produtoService = new ProdutoService(produtoRepo);
        VendaService vendaService = new VendaService(vendaRepo, clienteRepo, produtoRepo);

        // Inicialização de views
        MainView mainView = new MainView();
        ClienteView clienteView = new ClienteView();
        ProdutoView produtoView = new ProdutoView();
        VendaView vendaView = new VendaView();

        // Inicialização de controllers
        ClienteController clienteController = new ClienteController(clienteService, clienteView);
        ProdutoController produtoController = new ProdutoController(produtoService, produtoView);
        VendaController vendaController = new VendaController(vendaService, vendaView);

        // Menu principal
        int opcaoPrincipal;
        do {
            mainView.mostrarMenuPrincipal();
            opcaoPrincipal = mainView.lerOpcao();

            switch (opcaoPrincipal) {
                case 1 -> menuClientes(mainView, clienteController);
                case 2 -> menuProdutos(mainView, produtoController);
                case 3 -> menuVendas(mainView, vendaController);
                case 4 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcaoPrincipal != 4);
    }

    private static void menuClientes(MainView mainView, ClienteController controller) {
        int opcao;
        do {
            mainView.mostrarMenuClientes();
            opcao = mainView.lerOpcao();

            switch (opcao) {
                case 1 -> controller.criarCliente();
                case 2 -> controller.buscarCliente();
                case 3 -> System.out.println("Retornando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private static void menuProdutos(MainView mainView, ProdutoController controller) {
        int opcao;
        do {
            mainView.mostrarMenuProdutos();
            opcao = mainView.lerOpcao();

            if (opcao == 1) {
                controller.criarJogo();
            } else if (opcao != 2) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 2);
    }

    private static void menuVendas(MainView mainView, VendaController controller) {
        int opcao;
        do {
            mainView.mostrarMenuVendas();
            opcao = mainView.lerOpcao();

            if (opcao == 1) {
                controller.realizarVenda();
            } else if (opcao != 2) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 2);
    }
}