/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

import java.util.Scanner;

/**
 *100
 * @author mathe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somat = 0,num;
        do  {
            System.out.print("Digite um numero:");
            num = input.nextInt();
            if(num < 0){
                System.out.println("Números negativos não são permitidos");
            }
            else{
                somat += num;
            }
        } while (somat < 300);
        System.out.println("O somatório foi "+ somat);
    }
    
}
