package Operators.Problems;

public class StudentCheck {
	public static void main(String[] args) {
        int theoryMarks = 45;
        int practicalMarks = 50;

        if (theoryMarks >= 40 && practicalMarks >= 40) {
            System.out.println("Student passed both theory and practical.");
        } else {
            System.out.println("Student failed.");
        }
    }

}
