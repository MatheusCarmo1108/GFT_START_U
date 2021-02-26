/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02_03.main;

import Exercicio02.model.InvestimentoComIR;
import Exercicio02.model.InvestimentoSemIR;


/**
 *
 * @author mathe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] valInit = {5000,3000};
        double[] jurosMensais = {0.012,0.007};
       
        InvestimentoComIR InvestComIR = new InvestimentoComIR(valInit[0],jurosMensais[0]);       
        InvestimentoSemIR InvestSemIR = new InvestimentoSemIR(valInit[1],jurosMensais[1]);
        
        System.out.printf("Resultado do Investimento com IR: %.2f", InvestComIR.calcularLucro(17));
        System.out.printf("\nResultado do Investimento sem IR: %.2f\n",InvestSemIR.calcularLucro(10));
        
        

        
    }
    
}
