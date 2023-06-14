package org.example;

public class velocidadeNaoRegistrada extends FileReadingException{
    private static final long serialVersionUID = 4132123121313L;
    public velocidadeNaoRegistrada(){
        super();
    }
    @Override
    public String getMessage(){
        return "Velocidade não registrado.";
    }
}
