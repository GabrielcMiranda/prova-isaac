package com.prova.isaac;

public class Area {
    private String nome;
    private String localizacao;
    private double tamanho;

    public Area(String nome, String localizacao, double tamanho){
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    
    
}
