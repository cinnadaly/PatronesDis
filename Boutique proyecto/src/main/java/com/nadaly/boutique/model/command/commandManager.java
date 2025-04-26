package com.nadaly.boutique.model.command;

import java.util.Stack;

public class commandManager {

    private final Stack<command> historial = new Stack<>();


    public void ejecutarComando(command comando) {
        comando.ejecutar();
        historial.push(comando);
    }


    public void deshacerUltimo() {
        if (!historial.isEmpty()) {
            command comando = historial.pop();
            comando.deshacer();
        }
    }
}


