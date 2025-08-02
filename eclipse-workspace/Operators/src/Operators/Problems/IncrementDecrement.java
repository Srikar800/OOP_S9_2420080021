package Operators.Problems;

public class IncrementDecrement {
	 public static void main(String[] args) {
	        int val = 10;

	        System.out.println("Original value: " + val);
	        System.out.println("Post-increment: " + (val++));
	        System.out.println("After post-increment: " + val);
	        System.out.println("Pre-increment: " + (++val));

	        System.out.println("Post-decrement: " + (val--));
	        System.out.println("After post-decrement: " + val);
	        System.out.println("Pre-decrement: " + (--val));
	    }

}
