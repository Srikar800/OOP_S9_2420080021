package StringImmutability.Problems;

public class StringEquality {
	public static void main(String[] args) {
        String s1 = "OnePiece";
        String s2 = "OnePiece";
        String s3 = new String("OnePiece");

        System.out.println(s1 == s2);     
        System.out.println(s2 == s3);      
        System.out.println(s1.equals(s3)); 
    }

}
