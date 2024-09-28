import java.util.Scanner;

public class Kth_maxNmin {
   
    static void quicksort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int p = partition(arr, lb, ub);
            quicksort(arr, lb, p - 1);
            quicksort(arr, p + 1, ub);
        }
    }

   
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    
    static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while (start <= end) {
            while (start <= end && arr[start] <= pivot) {
                start++;
            }
            while (start <= end && arr[end] >= pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, lb, end); 
        return end; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("ENter the value of K");
        int k = input.nextInt();

        
        quicksort(array, 0, n - 1);

       
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        if (k > 0 && k <= n) {
          
            System.out.println(k + "-th minimum element: " + array[k - 1]);

           
            System.out.println(k + "-th maximum element: " + array[n - k]);
        } else {
            System.out.println("k is out of bounds. It should be between 1 and " + n);
        }
    }
}
