package Arrays.Problems;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
        int[] arr = {2, 4, 2, 8, 4, 6, 8};
        HashSet<Integer> uniqueSet = new HashSet<>();

        System.out.println("Unique elements:");
        for (int num : arr) {
            if (uniqueSet.add(num)) {
                System.out.println(num);
            }
        }
    }

}
