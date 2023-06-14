package org.example;

public class pesoNaoRegistrado extends FileReadingException{
    private static final long serialVersionUID = 7132123121313L;
    public pesoNaoRegistrado(){
        super();
    }
    @Override
    public String getMessage(){
        return "Peso não registrado.";
    }
}
