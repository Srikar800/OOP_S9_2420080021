package StringImmutability.Problems;

public class StringBufferAppend {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("The One Piece");
        System.out.println("Before append: " + sb);

        sb.append(" is Real.");
        System.out.println("After append: " + sb);
    }

}
