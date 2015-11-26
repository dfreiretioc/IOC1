/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis3_3;

/**
 *
 * @author Dan
 */
public class ComptaAsArray {
    public static void main(String[] args) {
      char[] array = {'a','c','z','a','w','a','q','f','f','c','a'};
       
      int comptador = 0;
      
      for (int i=0; i < array.length; i++){
          if (array[i] == 'a'){
              comptador++;
          }
      }
        System.out.println("Hi ha " + comptador + " caracters a");
        
    }
    
    
    
    
    
    
}
