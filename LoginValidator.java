
package Try;

import java.util.Scanner;

public class LoginValidator {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int attempt=0;
        
        while(attempt>5){
            System.out.println("Enter your username: ");
            String username=sc.nextLine();
            System.out.println("Enter yout password: ");
            String password=sc.nextLine();
        
            String status=LoginValidator(username,password);
                if (status.equals("success")){
            System.out.println("Login Successfully!");
                break;
            
            }else if (status.equals("failed")){
                System.out.println("Login Failed!");
                attempt++;
                System.out.println("Attempt:"+attempt);
        }
         
    }
        if (attempt==5){
            System.out.println("You've reached 5 attempts! Please Try again.");
        }
    
}
    private static String LoginValidator(String username, String password){
        String defaultUsername="Mikko";
        String defaultPassword="1234";
        if(username.equals(defaultUsername)&& password.equals(defaultPassword)){
            return"success";
            
        }else{ 
            return "failed";
        }
    }
    }
