package StringImmutability.Problems;

import java.util.Scanner;

public class ReverseLastName {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter full name: ");
	        String name = sc.nextLine();
	        
	        int spaceIndex = name.lastIndexOf(" "); // 
	        String firstPart = name.substring(0, spaceIndex); 
	        String lastName = name.substring(spaceIndex + 1); 
	        
	        String reversedLastName = new StringBuffer(lastName).reverse().toString();
	        
	        System.out.println("Name with reversed last name: " + firstPart + " " + reversedLastName);
	    }

}
