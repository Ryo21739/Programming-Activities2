package loginconceptmathcalculator.java;

import java.util.Scanner;

public class LoginConceptMathCalculatorJava {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String username = "Mikko";
       String password = "Hao";
       
        System.out.println("Enter Username: ");
        String typeUsername = sc.nextLine();
        
        System.out.println("Enter Password: ");
        String typePassword = sc.nextLine();
        
       if(username.equals(typeUsername)&& password.equals(typePassword)){
           System.out.println("Login Successfully! "); 
          
         System.out.println("Hi Mikko Hao");
        
        System.out.println("Please choose an option");
        
        
        System.out.println("A. Addition");
        System.out.println("B. Subtraction");
        System.out.println("C. Multipilication");
        System.out.println("D. Division");
        
        String choice = sc.nextLine().toUpperCase();
        
        int M = 10;
        int H = 5;
        
        switch (choice){
            case "A":
                System.out.println("You selected Addition: ");
                int add = M+H;
                System.out.println(M+H);
               break;
            case "B":
                System.out.println("You selected Subtraction: ");
                int sub = M-H;
                System.out.println(M-H);
               break;
            case "C":
                System.out.println("You selected Multiplication: ");
                int mult = M*H;
                System.out.println(M*H);
               break;
            case "D":
                System.out.println("You selected Division: ");
                int div = M/H;
                System.out.println(M/H);
               break;
               
            default:
                System.out.println("Invalid choice. Please select A, B, C,or D");
                
        }
        }else{
           System.out.println("Invalid Username or Password Login Failed");
       }
    }
    }
