/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_7;

import java.util.Scanner;
public class Ejercicio_resuelto_7 {
    
    int A;
    int B;
    
    Ejercicio_resuelto_7(int A,int B){
        this.A = A;
        this.B = B;
    }

    String Comparar(int A, int B) {
        if (A > B) {
            return "A es mayor que B";
        } else if (A == B) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    graphic_7 ventana = new graphic_7();
    ventana.show(true);
    }
    
}

