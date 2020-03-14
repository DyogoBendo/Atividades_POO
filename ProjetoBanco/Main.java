/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco_aula9;

import javax.swing.JOptionPane;

/**
 *
 * @author Dyogo
 */
public class Main {
    public static void main(String[] args) {
        // Guardar outros bancos, imprimir um relatorio em cada banco e somar tudo
        int optCofre = 0, optMoeda = 0, optBanco = 0;
        do {
           Banco b = new Banco();
           b.nome = JOptionPane.showInputDialog(null, "Nome do banco");
           
            do {
                Cofre c = new Cofre();
                do {
                    Moeda m = new Moeda();
                    m.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor da moeda"));
                    c.dindin.add(m);
                    optMoeda= Integer.parseInt(JOptionPane.showInputDialog(null, "Sair cofre(0)?"));
                } while (optMoeda!= 0);
                b.cofrinho.add(c);
                optCofre = Integer.parseInt(JOptionPane.showInputDialog(null, "Sair Cofre? ())"));
                
            } while (optCofre != 0);
            optBanco = Integer.parseInt(JOptionPane.showInputDialog(null, "Sair Banco? (0)"));
        } while (optBanco!=0);
    }
    
}
