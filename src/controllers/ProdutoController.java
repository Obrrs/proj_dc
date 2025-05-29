package controllers;

import exceptions.EntityNotFoundException;
import exceptions.InvalidOperationException;
import services.ProdutoService;
import views.ProdutoView;

public class ProdutoController {
    private final ProdutoService service;
    private final ProdutoView view;

    public ProdutoController(ProdutoService service, ProdutoView view) {
        this.service = service;
        this.view = view;
    }

    public void criarJogo() {
        try {
            String[] dados = view.obterDadosJogo();
            double preco = Double.parseDouble(dados[2]);
            service.cadastrarJogo(dados[0], dados[1], preco, dados[3], dados[4]);
            view.mostrarMensagem("Jogo cadastrado com sucesso!");
        } catch (InvalidOperationException | NumberFormatException e) {
            view.mostrarErro("Erro: " + e.getMessage());
        }
    }
}