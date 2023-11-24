package com.casamento.pedido;

import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pedido")
public class PedidoController {


    private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);

    @PostMapping
    @Operation(summary = "Endpoint para informar o seu nome mágico")
    public ResponseEntity<String> buscarPedido() {
        return ResponseEntity.ok("ok");
    }

}
