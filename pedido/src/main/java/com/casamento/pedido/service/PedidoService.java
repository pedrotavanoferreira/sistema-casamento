package com.casamento.pedido.service;

import org.springframework.stereotype.Component;

@Component
public class PedidoService {

    public String checkSecret(String valorSecreto) {
        String textoRetorno;
        if (valorSecreto.equals("lais-pikachu")){
            textoRetorno = "Quer casar comigo?";
        } else {
            textoRetorno = "Tente novamente!";
        }

        return textoRetorno;
    }

}
