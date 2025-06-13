package controllers;

import exceptions.EntityNotFoundException;
import exceptions.InvalidOperationException;
import services.ClienteService;
import views.ClienteView;

public class ClienteController {
    private final ClienteService service;
    private final ClienteView view;

    public ClienteController(ClienteService service, ClienteView view) {
        this.service = service;
        this.view = view;
    }

    public void criarCliente() {
        try {
            String[] dados = view.obterDadosCliente();
            service.cadastrarCliente(dados[0], dados[1], dados[2]);
            view.mostrarMensagem("Cliente cadastrado com sucesso!");
        } catch (InvalidOperationException e) {
            view.mostrarErro(e.getMessage());
        }
    }

    public void buscarCliente() {
        try {
            int id = view.obterIdCliente();
            service.buscarCliente(id);
            view.mostrarMensagem("Cliente encontrado!");
        } catch (EntityNotFoundException e) {
            view.mostrarErro(e.getMessage());
        }
    }
}