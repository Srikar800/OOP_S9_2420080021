package Operators.Problems;

public class BitWiseOperators {
	public class BitwiseOperators {
	    public static void main(String[] args) {
	        int p = 5, q = 3;

	        System.out.println("Bitwise AND: " + (p & q));    // 0101 & 0011 = 0001 → 1
	        System.out.println("Bitwise OR: " + (p | q));     // 0101 | 0011 = 0111 → 7
	        System.out.println("Bitwise XOR: " + (p ^ q));    // 0101 ^ 0011 = 0110 → 6
	        System.out.println("Bitwise Complement of p: " + (~p)); // ~5 = -6
	    }
}
