package org.example.record;

public class UsuarioService {

    UsuarioRecord usuarioRecord = new UsuarioRecord("Teste", "1");

    public void getUsuarioRecord() {

        System.out.println(usuarioRecord.nome());
        System.out.println("Sobrenome: " + usuarioRecord.sobrenome());
    }
}
