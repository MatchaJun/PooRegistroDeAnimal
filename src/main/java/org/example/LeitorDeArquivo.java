package org.example;

import java.io.File;
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
                if (animal.equals("Gato")) {
                    String raca = "";
                    try {
                        raca = scanner_linha.next();
                    } catch(Exception e){
                        System.out.println(FileReadingException.Erros.racaNaoCategorizada.getDescription());
                        return;
                    }
                    int idade = 0;
                    try {
                        idade = scanner_linha.nextInt();
                    } catch(Exception e){
                        System.out.println(FileReadingException.Erros.idadeNaoRegistrada.getDescription());
                        return;
                    }
                    int peso = 0;
                    try {
                        peso = scanner_linha.nextInt();
                    } catch(Exception e){
                        System.out.println(FileReadingException.Erros.pesoNaoRegistrado.getDescription());
                        return;
                    }
                    RegistroGato registro = new RegistroGato(animal, raca, idade, peso);
                    tabela.adicionar(registro);
                }else if (animal.equalsIgnoreCase("Cavalo")) {
                    int velocidade =0;
                    try {
                        velocidade = scanner_linha.nextInt();
                    } catch (Exception e) {
                        System.out.println(FileReadingException.Erros.velocidadeNaoRegistrada.getDescription());
                        return;
                    }
                    int alturaDoPulo = 0;
                    try {
                        alturaDoPulo = scanner_linha.nextInt();
                    } catch (Exception e) {
                        System.out.println(FileReadingException.Erros.alturaDoPuloNaoRegistrada.getDescription());
                        return;
                    }
                    int idade = 0;
                    try {
                        idade = scanner_linha.nextInt();
                    } catch(Exception e){
                        System.out.println(FileReadingException.Erros.idadeNaoRegistrada.getDescription());
                        return;
                    }
                    int peso = 0;
                    try {
                        peso = scanner_linha.nextInt();
                    } catch(Exception e){
                        System.out.println(FileReadingException.Erros.pesoNaoRegistrado.getDescription());
                        return;
                    }
                    RegistroCavalo registro = new RegistroCavalo(animal, idade, peso, velocidade, alturaDoPulo);
                    tabela.adicionar(registro);
                } else {
                    int idade = 0;
                    try {
                        idade = scanner_linha.nextInt();
                    } catch(Exception e){
                        System.out.println(FileReadingException.Erros.idadeNaoRegistrada.getDescription());
                        return;
                    }
                    int peso = 0;
                    try {
                        peso = scanner_linha.nextInt();
                    } catch(Exception e) {
                        System.out.println(FileReadingException.Erros.pesoNaoRegistrado.getDescription());
                        return;
                    }
                    Registro registro = new Registro(animal, idade, peso);
                    tabela.adicionar(registro);
                }

                scanner_linha.close();
            }

            scanner_arquivo.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        tabela.print();
    }
}
