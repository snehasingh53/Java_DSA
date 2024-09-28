public class NegativenumberFirst {

    static void moveNegativesToFront(int[] nums) {
        int n = nums.length;
        int j = 0; // Pointer for the position to place the next negative number

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                // Swap only if the current number is negative
                if (i != j) {
                    swap(nums, i, j);
                }
                j++; // Increment the position for the next negative number
            }
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNegativesToFront(array);

        // Print the modified array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
