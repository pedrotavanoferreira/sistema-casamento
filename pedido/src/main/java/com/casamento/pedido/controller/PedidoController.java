package com.casamento.pedido.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/pedido")
public class PedidoController {


    private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);

    @GetMapping
    @Operation(summary = "Endpoint para informar o seu nome mágico")
    public ResponseEntity<String> buscarPedido(@RequestParam String nomeSecreto) {
        return ResponseEntity.ok(nomeSecreto);
    }

}
