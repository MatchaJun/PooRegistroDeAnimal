package org.example;

class RegistroGato extends Registro {
    private String raca;

    public RegistroGato(String animal, String raca, int idade, int peso) {
        super(animal, idade, peso);
        this.raca = raca;
    }

    @Override
    public void print() {
        System.out.println(getAnimal() + " Raça:" + raca + " Idade:" + getIdade() + " Peso:" + getPeso());
    }
}
