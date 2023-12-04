package com.casamento.pedido.controller;

import com.casamento.pedido.service.PedidoService;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/pedido")
public class PedidoController {


    private final PedidoService pedidoService;
    private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    @Operation(summary = "Endpoint para informar o seu nome mágico")
    public ResponseEntity<String> buscarPedido(@RequestParam String valorSecreto) {
        return ResponseEntity.ok(pedidoService.checkSecret(valorSecreto));
    }

}
