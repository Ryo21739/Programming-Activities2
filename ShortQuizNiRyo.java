package main;

import java.util.Scanner;

public class ShortQuizNiRyo {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String[][] questions = {
            {"Which of the following is NOT a valid data type in Java?",
            "A. int", "B. char", "C. string", "D. double", "C"},
            {"Which of the following is a valid Java comment?", 
             "A. //", "B. --", "C. */", "D. #", "A"},
            { "Which symbol is used to denote the logical AND operator in Java?",
            "A. &", "B. &&", "C. /", "D. //", "B"},
            {"Which data type is used to store a single character in Java?",
            "A. int", "B. char", "C. boolean", "D. String", "B"}
        };

        System.out.print("Enter the number of users: ");
        int userCount = sc.nextInt();
        sc.nextLine(); 

        String[] userNames = new String[userCount];
        int[] userScores = new int[userCount];

        for (int i = 0; i < userCount; i++) {
            System.out.print("Enter your name: ");
            userNames[i] = sc.nextLine();

            
            int[] questionOrder = new int[questions.length];
            for (int j = 0; j < questions.length; j++) {
                questionOrder[j] = j;
            }
            for (int j = questionOrder.length - 1; j > 0; j--) {
                int random = (int) (Math.random()* (j));
                int attempt = questionOrder[j];
                questionOrder[j] = questionOrder[random];
                questionOrder[random] = attempt;
            }

            int score = 0;
            System.out.println("\nWelcome, " + userNames[i] + "! Let's start the quiz.\n");

            for (int questionsIndex : questionOrder) {
                System.out.println(questions[questionsIndex][0]);
                for (int j = 1; j <= 4; j++) {
                    System.out.println(questions[questionsIndex][j]);
                }
                System.out.print("Your answer (A-D): ");
                String answer = sc.nextLine(); 

                if (answer.equalsIgnoreCase(questions[questionsIndex][5])) {
                    score++;
                }
            }

            userScores[i] = score;
           
            
        }

        
        for (int i = 0; i < userCount - 1; i++) {
            for (int j = i + 1; j < userCount; j++) {
                if (userScores[j] > userScores[i]) {
                    int attemptScore = userScores[i];
                    userScores[i] = userScores[j];
                    userScores[j] = attemptScore;

                    String attemptName = userNames[i];
                    userNames[i] = userNames[j];
                    userNames[j] = attemptName;
                }
            }
        }

        
        System.out.println("=== Final Rankings ===");
        for (int i = 0; i < userCount; i++) {
            System.out.println((i + 1) + ". " + userNames[i] + " - " + userScores[i] + " points");
        }

        sc.close();
    }
}

        
        
         
        
            
        
        
       
        
        
       
            
        
    
    

