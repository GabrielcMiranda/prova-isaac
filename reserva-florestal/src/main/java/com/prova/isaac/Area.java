package com.prova.isaac;

public class Area {
    private String nome;
    private String localizacao;
    private double tamanho;
    private String[] avistados = new String[200];
    private String[] dataAvistamento = new String[200];
    private int contadorAvistamento = 0;




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

    public String getAvistados(int index) {
        return avistados[index];
    }

    public void setAvistados(int index, String avistados) {
        this.avistados[index] = avistados;
    }

    public String getDataAvistamento(int index) {
        return dataAvistamento[index];
    }

    public void setDataAvistamento(int index, String dataAvistamento) {
        this.dataAvistamento[index] = dataAvistamento;
    }

    public int getContadorAvistamento() {
        return contadorAvistamento;
    }

    public void setContadorAvistamento( int contadorAvistamento) {
        this.contadorAvistamento = contadorAvistamento;
    }

   

    
    
}
