
package main;

public class NewMain2 {

    
    public static void main(String[] args) {
       int [] array = {34, 56, 23, 89, 12, 78, 55, 21, 90, 11};
       
       int largest = array[0];
       int smallest = array[0];
       
       for (int i = 1; i < array.length; i++){
           if (array [i] > largest){
               largest = array [i];
               
           }else if(array [i] < smallest){
           smallest = array[i];
       }
       }
        System.out.println("Largest number:" + largest);
        System.out.println("Smallest number:" + smallest);
    }
    
}
