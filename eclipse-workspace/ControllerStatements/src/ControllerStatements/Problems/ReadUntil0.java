package ControllerStatements.Problems;

import java.util.Scanner;

public class ReadUntil0 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter numbers (0 to stop):");

        do {
            num = sc.nextInt();
            if (num != 0) {
                System.out.println("You entered: " + num);
            }
        } while (num != 0);

        System.out.println("Program stopped.");
    }

}
