package br.com.guiareze.asyncprocess.controller.adapter;

import br.com.guiareze.asyncprocess.controller.dto.RetornoDadosDTO;
import br.com.guiareze.asyncprocess.core.ports.controller.EnviaEventoFila;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/obter_dados")
public class GerenciamentoDadosController {

    @Autowired
    private EnviaEventoFila enviaEventoFila;

    @GetMapping
    public ResponseEntity<RetornoDadosDTO> obterDados(){

        System.out.println("Inicia método get.. " + LocalDateTime.now().toString());

        enviaEventoFila.enviarMsgFila();

        System.out.println("Finaliza método get.. " + LocalDateTime.now().toString());

        return new ResponseEntity<RetornoDadosDTO>(new RetornoDadosDTO("Teste OK"), HttpStatus.OK);

    }

}
