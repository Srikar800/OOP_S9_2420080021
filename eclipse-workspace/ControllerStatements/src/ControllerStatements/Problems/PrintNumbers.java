package ControllerStatements.Problems;

import java.util.Scanner;

public class PrintNumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter N: ");
	        int n = sc.nextInt();

	        System.out.println("Numbers from 1 to " + n + ":");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }
	    }

}
