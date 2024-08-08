package br.com.javaricci.chatricci;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import br.com.javaricci.chatricci.config.ObjetoMensagem;

@Controller
public class App {

    @MessageMapping("/chatMessage")
    @SendTo("/canal")
    public ObjetoMensagem sendMessage(ObjetoMensagem message){
        return message;
    }

}
