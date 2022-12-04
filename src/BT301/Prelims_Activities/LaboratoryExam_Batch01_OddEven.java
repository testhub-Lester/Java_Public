package Prelims_Activities;
/*
 Program: Odd and Even Input Numbers - Batch 01
 Note: Input 4 numbers in 2 List
 - if number is repeated Error(Exit Program)
 - Add values of 2 list parallely
 Syntaxs: Scanner, LinkedList,
*/
import java.util.*;
public class LaboratoryExam_Batch01_OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // LinkedList Row1 and Looping Inputs (If Numbers is Repeated Error Exit Program)
        LinkedList <Integer> row1 = new LinkedList <Integer>();
        for (int x = 0; x< 4; x++){
            System.out.println("Enter a number :");
            int input1 = scan.nextInt();
            if (row1.contains(input1)){
                System.out.println("Error");
                System.exit(0);
            }
            else{
                row1.add(input1);
            }
        }
        System.out.println("The numbers are: " + row1);
        
        // LinkedList Row2 and Looping Inputs (If Numbers is Repeated Error Exit Program)
        LinkedList <Integer> row2 = new LinkedList <Integer>();
        for (int x = 0; x< 4; x++){
            System.out.println("Enter a number :");
            int input2 =scan.nextInt();    
            if (row2.contains(input2) || row1.contains(input2)){
                System.out.println("Error");
                System.exit(0);
            }
            else{
                row2.add(input2);
            }
        }
        System.out.println("The numbers are: " +row2);

        // Adding The 2 List to 1 Variable And Checks if Sum is Odd or Even
        for(int x=0; x<4; x++){
            int total = row1.get(x)+row2.get(x);
            if (total % 2 == 0){
                System.out.println(total +" is even");
            }
            else{
                System.out.println(total +" is odd");
            }
        }
    }
}

