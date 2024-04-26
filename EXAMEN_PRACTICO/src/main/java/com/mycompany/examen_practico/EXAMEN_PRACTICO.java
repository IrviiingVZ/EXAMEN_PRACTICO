/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_practico;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EXAMEN_PRACTICO {

    public static void main(String[] args) {
        
        
        
            for (int i = 0; i < 100; i++) {
            int Piedra = 1;
            int Papel = 2;
            int Tijera = 3;
            
            System.out.println("Piedra, papel o tijera");
            Scanner captu = new Scanner (System.in);
            captu.nextLine();
                
            
            if(Piedra <= Papel)  {
            System.out.println("Papel"); 
            continue;
            }
            
            if(Piedra <= Tijera) {
               System.out.println("Piedra"); 
            continue;
            }
            
            if(Piedra <= Papel) {
               System.out.println("Piedra"); 
            continue;
         
            }
            
        
                if (i <= 5)
                    break;
        }
    }
}  
   
       
        
    
