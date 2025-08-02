package Arrays.Problems;

public class MinMax {
	public static void main(String[] args) {
        int[] arr = {12, 4, 7, 19, 3, 21, 8};

        int smallest = arr[0];
        int largest = arr[0];

        for (int num : arr) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
	

}
