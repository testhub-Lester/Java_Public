package Midterms_Activities;
/*
 Program: Barcode Checking - Batch02
 Note: Input Barcode the Shows Item Name correspond to that code.
 Syntaxs: Scanner, ArrayList,
*/
import java.util.*;
public class LaboratoryExam_Batch02_Barcode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <String> barcode = new ArrayList <String>();
        List <String> item = new ArrayList <String>();

        barcode.add("1001");
        barcode.add("1002");
        barcode.add("1003");
        barcode.add("1004");
        barcode.add("1005");
        barcode.add("1006");
        barcode.add("1007");
        barcode.add("1008");
        barcode.add("1009");
        barcode.add("1010");
                 
        item.add("Tide");
        item.add("Surf");
        item.add("Ariel");
        item.add("Pride");
        item.add("Champion");
        item.add("Bonux");
        item.add("Joy");
        item.add("Zonrox");
        item.add("Smart");
        item.add("Downy");

        // Print The 2 List
        for(int x = 0; x < barcode.size() ;x++){
            System.out.println(barcode.get(x) + " = " + item.get(x));
        }
        System.out.println();

        // Search Barcode and Print Result
        for(int x = 1; x > 0; x++){
            System.out.println("Enter Barcode: ");
            String input = scan.nextLine();
            
            if(barcode.contains(input)){
                int n = barcode.indexOf(input);
                System.out.println("Item name: " + item.get(n) + "\n");
            }
            else{
                System.out.println("Error");
            }
        }
    }
    
}