/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02_03.main;

import Exercicio02.model.InvestimentoComIR;
import Exercicio02.model.InvestimentoSemIR;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Main_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double valInit;
        System.out.print("Digite o valor Inicial:");
        valInit = input.nextDouble();
        
        double[] jurosMensais = {0.0035,0.003};
        
        InvestimentoComIR InvestComIR = new InvestimentoComIR(valInit,jurosMensais[0]);
        InvestimentoSemIR InvestSemIR = new InvestimentoSemIR(valInit,jurosMensais[1]);
        
        for (int i = 1; i < 37; i++) {
            double num1 = InvestSemIR.calcularLucro(i);
            double num2 = InvestComIR.calcularLucro(i);       
            System.out.println("Mês: "+ i +" | Investimento sem IR: "+df.format(num1)+" | Investimento com IR: "+df.format(num2));
            
        }
    }
    
}
