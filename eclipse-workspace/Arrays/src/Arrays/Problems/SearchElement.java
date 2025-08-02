package Arrays.Problems;

public class SearchElement {
	public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(key + " is found in the array.");
        } else {
            System.out.println(key + " is not found.");
        }
    }

}
