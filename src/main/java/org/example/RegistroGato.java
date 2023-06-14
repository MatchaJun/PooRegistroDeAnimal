package org.example;

class RegistroGato extends Registro {
    private String raca;

    public RegistroGato(String animal, String raca, int idade, int peso) throws FileReadingException {
        super(animal, idade, peso);

        if (raca == "" || raca == " " || raca == "error" || raca == null || raca.isEmpty()){
            throw new racaNaoCategorizada();
        }

        this.raca = raca;
    }

    @Override
    public void print() {
        System.out.println(getAnimal() + " Raça:" + raca + " Idade:" + getIdade() + " Peso:" + getPeso());
    }
}
