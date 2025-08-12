package StringImmutability.Problems;

public class AllBufferMethods {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");                  
        sb.insert(6, "Java ");                
        sb.replace(6, 10, "Beautiful");       
        sb.delete(6, 15);                     
        sb.reverse();                         
        System.out.println("Final StringBuffer: " + sb);

        
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }

}
