package wrapper.problems;

public class Unboxing {
	public static void main(String[] args) {
        Integer boxed = Integer.valueOf(25);
        int unboxed = boxed.intValue();  
        System.out.println("Unboxed int: " + unboxed);
        
	}

}
