/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosdimensiones;

import java.util.Scanner;


public class DosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        System.out.println("Digite el tamano de la matriz: ");
        int tam = x.nextInt();
        int[][]matriz = new int[tam][tam];
        
        for(int fil = 0; fil < matriz.length; fil++ ){
            for(int col = 0; col < matriz.length; col++){
                System.out.println("Digite la posicion [ " + (fil + 1) + "," + (col + 1) + " ] de la matriz: ");
                int pos = x.nextInt();
                matriz[fil][col] = pos;             
    }   
}
    
        System.out.println(" ");
        
        for(int fil = 0; fil < matriz.length; fil++ ){
            for(int col = 0; col < matriz.length; col++){
                System.out.println(matriz[fil][col] + " ");  
                }
            System.out.println(" ");
    }
        System.out.println(" ");
                                  
    }
}

