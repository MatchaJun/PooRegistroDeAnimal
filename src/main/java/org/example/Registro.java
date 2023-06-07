package org.example;

import java.io.Serializable;

public class Registro implements Serializable {
    private String animal;
    private int idade;
    private int peso;

    public Registro(String animal, int idade, int peso){
        this.animal = animal;
        this.idade = idade;
        this.peso=  peso;
    }
    public String getAnimal() {
        return animal;
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }
    public void print(){
        System.out.println(animal + " Idade:" + idade + " Peso:" + peso);
    }
}

