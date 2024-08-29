package com.housesale;

public class User {
    private String tipo;

    public User(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void comprarCasa(){
        
    }

    @Override
    public String toString() {
        return "User{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
