package org.example;

public class racaNaoCategorizada extends FileReadingException{
    private static final long serialVersionUID = 9132123121313L;
    public racaNaoCategorizada(){
        super();
    }
    @Override
    public String getMessage(){
        return "Raça não categorizada.";
    }
}
