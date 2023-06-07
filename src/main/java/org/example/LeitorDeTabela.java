package org.example;

import java.io.FileInputStream;
import java.io.*;

public class LeitorDeTabela extends Leitor{
    private FileInputStream arquivo;
    public LeitorDeTabela(FileInputStream arquivo){
        this.arquivo = arquivo;
    }
    void processarDados(){
        Tabela tabela = null;
        try {
            ObjectInputStream restaurador = new ObjectInputStream(arquivo);
            tabela = (Tabela) restaurador.readObject();
            restaurador.close();
            arquivo.close();
            tabela.print();
        }catch(Exception e){}
    }

}
