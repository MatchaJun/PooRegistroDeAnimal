package org.example;

public class alturaDoPuloNaoRegistrada extends FileReadingException{
    private static final long serialVersionUID = 5132123121313L;
    public alturaDoPuloNaoRegistrada(){
        super();
    }
    @Override
    public String getMessage(){
        return "Altura do pulo não registrado.";
    }

}
