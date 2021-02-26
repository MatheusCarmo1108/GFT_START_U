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
public class InvestimentoComIR extends Investimento{
    
    public InvestimentoComIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }
    
    @Override
    public double calcularLucro (int meses){
        double valorFinal,desc = 0 ;
        valorFinal = (getValorInicial()*((Math.pow((1+getJurosMensais()),meses)))- getValorInicial());
        
        if(meses <6){
            desc = valorFinal*0.225;
        }else if (meses >= 6 && meses < 12 ) {
            desc = valorFinal*0.2;
        }else if (meses >= 12 && meses < 24) {
            desc = valorFinal*0.175;
        }else if (meses >= 24) {
            desc = valorFinal*0.15;
        }
        
        return (valorFinal - desc);
    }
    
}
