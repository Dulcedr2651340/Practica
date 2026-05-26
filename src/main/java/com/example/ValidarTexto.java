package com.example;

public class ValidarTexto implements Validador<String>{

    @Override
    public boolean validar(String valor){
        return !valor.trim().isEmpty();
    }
    
}
