package org.example;
import java.io.*;


public class Main {
    private static final String NOME_ARQUIVO = "animal.txt";
    private static final String NOME_ARQUIVO_TABELA = "AnimaisRegistrados.cleef";


    public static void main(String[] args) {
        File arquivo = new File(NOME_ARQUIVO);
        boolean arquivoTabelaExiste = true;
        FileInputStream arquivoTabela = null;
        try {
            arquivoTabela = new FileInputStream(NOME_ARQUIVO_TABELA);
        }
        catch(Exception e){arquivoTabelaExiste = false;}
        Leitor leitor;
        if (arquivo.exists()) {
            leitor = new LeitorDeArquivo(arquivo);
        }
        else if(arquivoTabelaExiste){
            leitor = new LeitorDeTabela(arquivoTabela);
        }else {
            leitor = new LeitorDeInterface();
        }

        leitor.processarDados();
    }
}

