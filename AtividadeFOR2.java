/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadefor2;
import java.util.Scanner;
/**
 *
 * @author sabri
 */
public class AtividadeFOR2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.println("--------------TABUADA-----------------------");
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        System.out.println("A tabuada do número " + numero + " é: " );
        
        for(int contador = 1; contador <= 10; contador++){
            int tabuada = numero * contador;
            System.out.println(numero + "x" + contador + "=" + tabuada);
            
        }
    }
}
