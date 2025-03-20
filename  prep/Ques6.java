/*You are given an array A of size N. Your friend gave me an amazıng task for you. Your friend likes one type of Sequence. So, he called that type of sequence a fair sequence. You should select a fair sequence of maximum length from an array. Here a fair sequence is nothing but you have to select elements in a pattern like positive element, negative element, positive element… (negative element, positive element, negative element, to form a sequence.
Your task is to print the maximum sum of elements possible by selecting a fair subsequence with maximum length.
Ex: If array A = [21, 12, 13, -21, -2]. Here your minimum length can be which subsequences 21, -2. The sum is 19. Your task is to print the maximum sum of elements possible by selecting a fair subsequence with maximum length.

NOTE: You should select the elements in a fair sequence only.

Example – 1:

Input:
5 – N ( Number of elements in an array )
21 12 13 -21 -2 – Array A consists of N elements
Output:
19
Explanation:
Here you can select 21, -2 subsequences of maximum length 2. The sum is 19 which is the maximum possible for a fair subsequence */








import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
      int sum =0;
      int maxSum=0;
      ArrayList<Integer> Positive = new ArrayList<>();
      ArrayList<Integer> Negative = new ArrayList<>();
      Scanner input = new Scanner(System.in);
      System.out.println("Size of Array");
      int n =input.nextInt();
      int[] arr= new int[n];
      System.out.println("Enter the array");
      for(int i =0;i<n;i++){
        arr[i]=input.nextInt();
      }
       for(int i =0;i<n;i++){
        if(arr[i]>=0){
          Positive.add(arr[i]);
        }
        else{
          Negative.add(arr[i]);
        }
      }
      for(int j =0;j<Positive.size();j++){
         for(int k =0;k<Negative.size();k++){
           sum = Positive.get(j)+Negative.get(k);
           maxSum=Math.max(sum,maxSum);
         }
      }
      System.out.println(maxSum);
      
  }
}