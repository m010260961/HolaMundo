package com.acme;

public record PersonaRegistro (String nombre, String apellidos) {

    @Override
    public String toString() {
        //Alejandro comente la linea de codigo que considero se puede elimin
         //System.out.println("Esta instruccuon es inservible")
        return "%s %s". formatted(nombre, apellidos);
    }
}
