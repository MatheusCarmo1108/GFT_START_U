/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02.model;

/**
 *
 * @author mathe
 */
public class InvestimentoSemIR extends Investimento {

    public InvestimentoSemIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calcularLucro(int meses) {
        double valorFinal,desc = 0 ;
        valorFinal = (getValorInicial()*((Math.pow((1+getJurosMensais()),meses)))- getValorInicial());
        
        if (this.getValorInicial() < 1000) {
            valorFinal =0;
        }
        return valorFinal;
    }
    
}
