package com.prova.isaac;

public class Area {
    private String nome;
    private String localizacao;
    private String logradouro;
   private String complemento;
   private String bairro;
   private String localidade;
   private String uf;
    private double tamanho;
    private String[] avistados = new String[200];
    private String[] dataAvistamento = new String[200];
    private int contadorAvistamento = 0;




    public Area(String nome, String localizacao, double tamanho){
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public void setInfoEndereco(Endereco endereco){
        this.logradouro = endereco.getLogradouro();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.localidade = endereco.getLocalidade();
        this.uf = endereco.getUf();
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

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    

    

   

    
    
}
