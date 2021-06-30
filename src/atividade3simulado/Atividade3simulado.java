/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3simulado;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Atividade3simulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double acum=0, num;
        int cont, quant;
        System.out.println("Quantos números deseja por?");
        quant = ler.nextInt();
        for(cont = 0; cont<quant; cont++){
            System.out.println("Informe o "+(cont+1)+"º valor");
            num = ler.nextDouble();
            acum = acum + num;
            
        }System.out.println("A média dos números lidos é: "+(acum/cont));
    }
    
}
