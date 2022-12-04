package Prelims_Activities;
/*
 Program: Login - Array / Batch 01
 Note: Input Users and Passwords
 - Next Check if User and Pass is Valid or Invalid
 Syntaxs: Scanner, Array,
*/
import java.util.Scanner;
public class Activity01_Batch01_Login {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Integer Scanner
		Scanner scan1 = new Scanner(System.in); // String Scanner

        // Input Index
		System.out.println("Input Index");
		int index = scan.nextInt();
		
        // String Array for Username and Password
		String username[] = new String[index];
		String password[] = new String[index];
		
        // Input Usernames and Passwords
		for (int x = 0; x < index; x++) {
			System.out.println("Index:"+x);
            // Username(Array) Inputs
			System.out.print("User: ");
			username[x] = scan1.nextLine();
            // Password(Array) Inputs
			System.out.print("Pass: ");
			password[x] = scan1.nextLine();
		}
		
        // Login Inputs
		System.out.println("Login");
		System.out.print("Username: ");
		String user = scan1.nextLine();
		System.out.print("Password: ");
		String pass = scan1.nextLine();
		
        // Login Checkings
		int result = 0;
		for (int x = 0; x < index; x++) {
			if(username[x].equals(user)&&password[x].equals(pass)) {
				result = 1;
				break;
			}
			else if (!username[x].equals(user)&&!password[x].equals(pass)){
				result = 0;
			}
		}
		
		if (result == 1){
			System.out.println("Valid");
		}
		else if (result == 0){
			System.out.println("Invalid");
		}
	}
}

