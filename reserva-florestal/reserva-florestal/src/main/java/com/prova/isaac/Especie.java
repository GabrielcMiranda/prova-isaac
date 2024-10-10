package com.prova.isaac;

public class Especie {
    private String nome;
    private String tipo;
    private boolean statusAmeaca;

    public Especie(String nome, String tipo, boolean statusAmeaca){
        this.nome = nome;
        this.tipo = tipo;
        this.statusAmeaca = statusAmeaca;

    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isStatusAmeaca() {
        return statusAmeaca;
    }

    

    

    

    
}
