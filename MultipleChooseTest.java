/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author PC
 */
public class MultipleChooseTest {

    
    public static void main(String[] args) {
       
       char [] Key = {'D','B','D','C','C','D','A','E','A','D'};
       char [][] studentAnswer={
           {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
           {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
           {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
           {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
           {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
           {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
           {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
           {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
       };
        
        for (int i = 0; i < studentAnswer.length; i++) {
            int score=0;
            for (int j = 0; j < Key.length; j++) {
                if(studentAnswer[i][j]==Key[j]){
                score++;
                }   
            }
            System.out.println("Student " +i+ " score" + ":" + score);
        }
       
       
       
    
}
       
       
}
    

