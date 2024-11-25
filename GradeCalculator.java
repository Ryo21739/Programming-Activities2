package main;

import java.util.Scanner;


public class GradeCalculator {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Sub1");
        double grade1=sc.nextDouble();
        System.out.println("Enter Sub2");
        double grade2=sc.nextDouble();
        System.out.println("Enter Sub3");
        double grade3=sc.nextDouble();
        
        String result = calculate(grade1, grade2, grade3);
        System.out.println(result);
        
        
        
    }
    public static String calculate(double grade1, double grade2, double grade3){
        double average = (grade1+grade2+grade3)/3;
        if(average >=85){
            return "Passed";
        }else{
            return "Failed";
        }
    }
    
}
