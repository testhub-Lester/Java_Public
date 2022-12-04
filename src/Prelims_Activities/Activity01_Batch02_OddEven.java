package Prelims_Activities;
/*
 Program: Odd and Even w/Search Element - Batch 02
 Note: Input Numbers and Checks if Odd or Even
 - First input how many you can enter (index input)
 - Checks if odd or Even
 - Search inputed number element
 Syntaxs: Scanner, Array
*/
 import java.util.*;
public class Activity01_Batch02_OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input Index of Array
        System.out.println("Input Index: ");
        int index = scan.nextInt();

        // Spacing
        System.out.println("");
        
        // Array for Numbers
        int numbers[] = new int [index];

        // Looping for Inputs in Array
        for (int x = 0; x <index; x++){
            System.out.print("Index["+x+"]: ");
            numbers[x] = scan.nextInt();
        }

        // Spacing
        System.out.println("");

        // Print Odd Numbers
        System.out.println("ODD NUMBERS: ");
        for (int y = 0; y < index; y++){
            if (numbers[y] % 2==1){
                System.out.print("ID["+y+"]: ");
                System.out.println(numbers[y]);
            }
        }

        // Spacing
        System.out.println("");

        // Print Even Numbers
        System.out.println("EVEN NUMBERS: ");
        for (int z = 0; z < index; z++){
            if (numbers[z] % 2==0){
                System.out.print("ID["+z+"]: ");
                System.out.println(""+ numbers[z]+"");
            }
        }
        // Spacing
        System.out.println("");

        // Search 01 - Input number to search
        System.out.println("Search Number Element: ");
        int search = scan.nextInt();

        int result = 0;
        for (int s = 0; s < index; s++){
            if (numbers[s] == search){
                System.out.println("Element: "+ s);
                result = 1;
                // break; //Delete comment if you want just 1 answer
            }
        }

        // Search 02 - Input is not found
        if (result == 0){
            System.out.println("Not Found");
        }

    }
}
