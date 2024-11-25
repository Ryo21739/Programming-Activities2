
package main;

import java.util.Scanner;

public class ListOfStudentsScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] students={"John", "Alice", "Bob", "Eve"};
        int[] scores = {85, 92, 76, 88};
        
        System.out.println("Student List");
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]+ "-"+ scores[i]);
        }
        System.out.println("\nEnter the name of the students to update the score: ");
        String name = sc.nextLine();
        
        for (int i = 0; i < students.length; i++){
            if (students[i].equalsIgnoreCase(name)){
                System.out.println("Enter the new score " + name + ":");
                scores[i] = sc.nextInt();
                break;
                
            }
        }
        System.out.println("\nUpdated student list: ");
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i] + "-" + scores[i]);
        }
    }
    
}
