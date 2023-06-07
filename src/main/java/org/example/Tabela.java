package org.example;
import java.util.*;
import java.io.*;
public class Tabela implements Serializable{
    private List<Registro> registros;
    public Tabela(){
        registros = new ArrayList<Registro>();
    }
    public void adicionar(Registro r){
        registros.add(r);
    }
    public void print(){
        for (Registro r: registros) r.print();
    }

    public void salvar(String nome_arquivo){
        try{
            FileOutputStream arquivo = new FileOutputStream(nome_arquivo);
            ObjectOutputStream gravador = new ObjectOutputStream(arquivo);

            gravador.writeObject(this);

            gravador.close();
            arquivo.close();
        }
        catch (Exception e){}
    }
}
