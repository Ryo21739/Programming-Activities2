/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author PC
 */
public class CountaVowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String text="Mikko";
       System.out.println("The number of vowels in "+text+" is :"+countVowels(text));
      

   
        }
       public static int countVowels(String text){
           int count=0;
           for (int i=0; i < text.length(); i++){
            char letter=text.toLowerCase().charAt(i);
            if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
              count ++;
            }
           
       }
           return count;
    }
}
