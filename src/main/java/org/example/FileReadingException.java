package org.example;

public class FileReadingException extends Exception{
    //private static final long serialVersionUID = 313213121313L;
    public FileReadingException(){
        super();
    }

    @Override
    public String getMessage(){
        return "Exceção genérica";
    }
}


