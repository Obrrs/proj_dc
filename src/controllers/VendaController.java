package controllers;

import exceptions.EntityNotFoundException;
import exceptions.InvalidOperationException;
import services.VendaService;
import views.VendaView;

public class VendaController {
    private final VendaService service;
    private final VendaView view;

    public VendaController(VendaService service, VendaView view) {
        this.service = service;
        this.view = view;
    }

    public void realizarVenda() {
        try {
            int[] ids = view.obterIdsVenda();
            service.realizarVenda(ids[0], ids[1]);
            view.mostrarMensagem("Venda realizada com sucesso!");
        } catch (InvalidOperationException | EntityNotFoundException e) {
            view.mostrarErro(e.getMessage());
        }
    }
}