package Prelims_Activities;
/*
 Program: Input Users and Passwords - Batch 02
 Note: Input Users and Passwords
 - if user or pass is repeated store it as 0 value
 Syntaxs: Scanner, LinkedList,
*/
import java.util.*;
public class LaboratoryExam_Batch02_InputUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // LinkedList for Username and passwordList
        LinkedList <String> usernameList = new LinkedList <String>();
        LinkedList <String> passwordList = new LinkedList <String>();
        
        System.out.println("Input 4 Username And passwordLists");
        System.out.println();
        
        // Input Username(LinkedList) and Password(LinkedList) and stored to list
        // If User or Pass is Repeated stored it as a O value 
        for (int x = 0; x < 4; x++){
            System.out.println("Input Username ["+x+"] :");
            String user = scan.nextLine();
            System.out.println();

            if (usernameList.contains(user) || passwordList.contains(user)){
                System.out.println("Input Error\t");
                usernameList.add("0");
            }
            else{
                usernameList.add(user);
            }
            
            System.out.println("Input Password ["+x+"] :");
            String pass = scan.nextLine();
            System.err.println();

            if (passwordList.contains(pass) || usernameList.contains(pass)){
                System.out.println("Input Error\t");
                passwordList.add("0");
            }
            else{
                passwordList.add(pass);
            }
        }
        
        // Print stored values in Username(LinkedList) and Password(Linkedlist)
        System.out.println("Result: ");
        System.out.println("Usernames [List]:"+ usernameList);
        System.out.println("Password [List]:" + passwordList);
        System.out.println();

        // Print 2 List in Vertically
        System.out.println("Username: " + "Password: ");
        for (int x = 0; x < usernameList.size(); x++){
            System.out.println(usernameList.get(x)+ "\t " + passwordList.get(x));
        }
    }
}

