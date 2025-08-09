package StringImmutability.Problems;

public class StringImmutabilitytwovariables {
	public static void main(String[] args) {
        String str1 = "Piece";
        String str2 = str1; 
        str1 = "One"; 

        System.out.println("str1: " + str1); 
        System.out.println("str2: " + str2); 
    }

}
