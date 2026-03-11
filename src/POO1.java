/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo1;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class POO1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu primeiro numero: ");
        float nro1 = sc.nextFloat();
        System.out.println("Digite o segundo: ");
        float nro2 = sc.nextFloat();
        
        Calculadora calc = new Calculadora();
        
        float resultado = calc.somar(nro1, nro2);
        System.out.println("Sua soma e igual a: " + resultado);
        resultado = calc.subtrair(nro1, nro2);
        System.out.println("Sua subtracao e igual a: " + resultado);
        resultado = calc.multiplicar(nro1, nro2);
        System.out.println("Sua multiplicao e igual a: " + resultado);
        resultado = calc.dividir(nro1, nro2);
        System.out.println("Sua divisao e igual a: " + resultado);
   
        sc.close();
                
    }
}
