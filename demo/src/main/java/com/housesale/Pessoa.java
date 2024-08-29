package com.housesale;
public class Pessoa {
    private  String nome;
    private  String emai;
    private int  telfone;
    private String endereco;

    public Pessoa(String nome, String emai, int telfone, String endereco) {
        this.nome = nome;
        this.emai = emai;
        this.telfone = telfone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public int getTelfone() {
        return telfone;
    }

    public void setTelfone(int telfone) {
        this.telfone = telfone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
}
