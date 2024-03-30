package org.example;

import org.example.record.UsuarioRecord;
import org.example.record.UsuarioService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();

        usuarioService.getUsuarioRecord();
    }
}