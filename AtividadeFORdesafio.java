/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadefordesafio;
import java.util.Scanner;
/**
 *
 * @author sabri
 */
public class AtividadeFORdesafio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("digite um número: ");
        int numero = scanner.nextInt();
        
        for (int contador = 1 ; contador <= numero; contador++) {
            int resultado = contador * contador;
            System.out.println(contador + "² = " + resultado);
    } 
    }
}
