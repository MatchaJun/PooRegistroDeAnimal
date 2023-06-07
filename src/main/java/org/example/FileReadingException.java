package org.example;

public class FileReadingException extends Exception{
    //private static final long serialVersionUID = 313213121313L;
    public FileReadingException(Erros erros){
        super(erros.getDescription());
    }
    public enum Erros{
        racaNaoCategorizada, idadeNaoRegistrada, animalNaoRegistrado, pesoNaoRegistrado, velocidadeNaoRegistrada, alturaDoPuloNaoRegistrada;
        public String getDescription(){
            switch (this){
                case racaNaoCategorizada: return "Raça não categorizada.";
                case idadeNaoRegistrada: return "Idade não registrada.";
                case animalNaoRegistrado: return "Animal não registrado.";
                case pesoNaoRegistrado: return "Peso não registrado.";
                case velocidadeNaoRegistrada: return "Velocidade não registrada";
                case alturaDoPuloNaoRegistrada: return "Altura do pulo não registrada";
                default: return "";
            }
        }
    }

}


