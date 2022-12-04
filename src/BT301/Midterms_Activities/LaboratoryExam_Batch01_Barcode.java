package Midterms_Activities;
/*
 Program: Barcode Checking - Batch 01
 Note: Read File.txt then input Barcode the Shows Item Name correspond to that code.
 Syntaxs: Scanner, File,
*/
import java.util.*;
import java.io.*;
public class LaboratoryExam_Batch01_Barcode {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        File filename = new File("src/Midterms_Activities/Barcode.txt"); 

        // Barcode checking - File Io
        for(int x = 1; x != 0; x++){
            // Input Barcode
            Scanner fileScan = new Scanner(filename);
            System.out.println("Input Barcode: ");
            String input = scan.nextLine();

            // Checking Barcode and Show Item Name
            int result = 0;
            while(fileScan.hasNextLine()){
                String var = fileScan.next();
                if(input.equals(var)){
                    System.out.println("Item Name: " + fileScan.next());
                    result = 1;
                    break;
                }
                else if(!input.equals(var)){
                    result = 0;
                }
            }
            if(result == 0){
                System.out.println("Error");
            }
        }
        
    }
}
/* Note: On .txt File

Format:
Barcode ItemName
1001    Tide

Tips: No Spacing On ItemName

---------------------
On .txt File:
1001 Tide Power = Error

Output:

Input Barcode: 
1001
Item Name: Tide
---------------------

Tips: Add _ if you Need Spacing

---------------------
On .txt File:
1001 Tide_Powder

Output: 
Input Barcode: 
1001
Item Name: Tide_Powder
---------------------
 */
