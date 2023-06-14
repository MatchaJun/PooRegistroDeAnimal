package org.example;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorDeArquivo extends Leitor{
    private File arquivo;
    private Tabela tabela = new Tabela();
    public LeitorDeArquivo(File arquivo){
        this.arquivo = arquivo;
    }



    void processarDados(){
        try {
            Scanner scanner_arquivo = new Scanner(arquivo);

            while (scanner_arquivo.hasNextLine()) {
                String linha = scanner_arquivo.nextLine();
                Scanner scanner_linha = new Scanner(linha);
                scanner_linha.useDelimiter(" ");

                String animal = scanner_linha.next();


                String raca;
                int idade, peso, velocidade, alturaDoPulo;

                try{
                    idade = scanner_linha.nextInt();
                }catch(Exception e){
                    idade = -1;
                }

                try{
                    peso = scanner_linha.nextInt();
                }catch(Exception e){
                    peso = -1;
                }


                try {
                    if (animal.equals("Gato")) {
                        try {
                            raca = scanner_linha.nextLine();
                        }catch (Exception e){
                            raca = "";
                        }
                        RegistroGato registro = new RegistroGato(animal, raca, idade, peso);
                        tabela.adicionar(registro);
                    } else if (animal.equals("Cavalo")) {
                        try {
                            velocidade = scanner_linha.nextInt();
                        }catch(Exception e){
                            velocidade = -1;
                        }

                        try {

                            alturaDoPulo = scanner_linha.nextInt();
                        }catch(Exception e){
                            alturaDoPulo = -1;
                        }
                        RegistroCavalo registro = new RegistroCavalo(animal, idade, peso, velocidade, alturaDoPulo);
                        tabela.adicionar(registro);
                    } else {
                        Registro registro = new Registro(animal, idade, peso);
                        tabela.adicionar(registro);
                    }

                    scanner_linha.close();
                }catch(FileReadingException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }

            scanner_arquivo.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        tabela.print();
    }
}
