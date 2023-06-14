package org.example;

public class animalNaoRegistrado extends  FileReadingException{
    private static final long serialVersionUID = 6132123121313L;
    public animalNaoRegistrado(){
        super();
    }
    @Override
    public String getMessage(){
        return "Animal não registrado.";
    }
}
