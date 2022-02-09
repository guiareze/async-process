package br.com.guiareze.asyncprocess.core.service;

import br.com.guiareze.asyncprocess.core.ports.controller.EnviaEventoFila;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EnviaEventoFilaImpl implements EnviaEventoFila {

    @Async
    @Override
    public void enviarMsgFila() {

        try {
            System.out.println("Enviando email.. " + LocalDateTime.now().toString());
            Thread.sleep(7000);
            System.out.println("Email enviado com sucesso.. " + LocalDateTime.now().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
