package org.example;

public class RegistroCavalo extends Registro{
    private int velocidade;
    private int alturaDoPulo;

    public RegistroCavalo(String animal, int idade, int peso, int velocidade, int alturaDoPulo) throws FileReadingException {
        super(animal, idade, peso);
        if (velocidade < 0){throw new velocidadeNaoRegistrada();}
        if(alturaDoPulo < 0){throw new alturaDoPuloNaoRegistrada();}
        this.velocidade = velocidade;
        this.alturaDoPulo = alturaDoPulo;
    }

    @Override
    public void print() {
        System.out.println(getAnimal()  + " Idade:" + getIdade() + " Peso:" + getPeso() + " Velocidade:" + velocidade + " Altura do Pulo:" + alturaDoPulo);
    }
}
