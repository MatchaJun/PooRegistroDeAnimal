package org.example;

public class idadeNaoRegistrada extends  FileReadingException{
    private static final long serialVersionUID = 1132123121313L;
    public idadeNaoRegistrada(){
        super();
    }
    @Override
    public String getMessage(){
        return "Idade não registrada.";
    }
}
