/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores_arrays;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Vetores_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int [5];
        int[] vetorB = new int [vetorA.length];/*vetor com 5 posições*/
       
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição: " + i + ": ");
            vetorA[i] = leitor.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
       System.out.println("Vetor A: ");
       for (int i = 0; i <vetorA.length; i++) {
        System.out.println("O valor para a posição " + i + " é: " + vetorA[i]);
    }
       System.out.println("Vetor B: ");
       for (int i = 0; i <vetorB.length; i++) {
        System.out.println("O valor para a posição " + i + " é: " + vetorB[i]);
       
    }
    
   }
}
