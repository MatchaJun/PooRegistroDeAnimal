package org.example;

import javax.swing.*;

public class LeitorDeInterface extends Leitor {
    private Tabela tabela = new Tabela();
    private boolean cancelar = false;
    public void processarDados() {

        JTextField animalField = new JTextField();
        JTextField racaField = new JTextField();
        JTextField idadeField = new JTextField();
        JTextField pesoField = new JTextField();
        JTextField velocidadeField = new JTextField();
        JTextField alturaDoPuloField = new JTextField();

        animalField.setColumns(10);
        idadeField.setColumns(10);
        pesoField.setColumns(10);
        racaField.setColumns(10);
        velocidadeField.setColumns(10);
        alturaDoPuloField.setColumns(10);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Animal:"));
        panel.add(animalField);
        panel.add(new JLabel("Raca (para gatos):"));
        panel.add(racaField);
        panel.add(new JLabel("Idade:"));
        panel.add(idadeField);
        panel.add(new JLabel("Peso:"));
        panel.add(pesoField);
        panel.add(new JLabel("Velocidade (para cavalos):"));
        panel.add(velocidadeField);
        panel.add(new JLabel("AlturaDoPulo (para cavalos):"));
        panel.add(alturaDoPuloField);


        while (!cancelar) {
            int result = JOptionPane.showConfirmDialog(null, panel, "Preencher Dados Manualmente",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                String animal = animalField.getText();
                int idade = 0;
                try {
                    idade = Integer.parseInt(idadeField.getText());
                } catch (Exception e) {
                    System.out.println(FileReadingException.Erros.idadeNaoRegistrada.getDescription());
                    return;
                }
                int peso = 0;
                try {
                    peso = Integer.parseInt(pesoField.getText());
                } catch (Exception e) {
                    System.out.println(FileReadingException.Erros.pesoNaoRegistrado.getDescription());
                    return;
                }

                Registro registro;
                if (animal.equalsIgnoreCase("Gato")) {
                    String raca = racaField.getText();
                    if (raca.isEmpty()) {
                        System.out.println(FileReadingException.Erros.racaNaoCategorizada.getDescription());
                        return;
                    }
                    registro = new RegistroGato(animal, raca, idade, peso);
                }
                else if (animal.equalsIgnoreCase("Cavalo")) {
                    int velocidade =0;
                    try {
                        velocidade = Integer.parseInt(velocidadeField.getText());
                    } catch (Exception e) {
                        System.out.println(FileReadingException.Erros.velocidadeNaoRegistrada.getDescription());
                        return;
                    }
                    int alturaDoPulo = 0;
                    try {
                        alturaDoPulo = Integer.parseInt(alturaDoPuloField.getText());
                    } catch (Exception e) {
                        System.out.println(FileReadingException.Erros.alturaDoPuloNaoRegistrada.getDescription());
                        return;
                    }
                    registro = new RegistroCavalo(animal, idade, peso, velocidade, alturaDoPulo);
                }else {
                    registro = new Registro(animal, idade, peso);
                }
                registro.print();
                tabela.adicionar(registro);

                animalField.setText("");
                racaField.setText("");
                idadeField.setText("");
                pesoField.setText("");
                velocidadeField.setText("");
                alturaDoPuloField.setText("");
            }
            else{cancelar = true;}
        }
        tabela.salvar("AnimaisRegistrados.cleef");
    }
}
