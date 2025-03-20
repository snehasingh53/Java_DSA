
/* Given an array Arr[] of size T, contains binary digits.
Where
0 represents a biker running to the north.
1 represents a biker running to the south.
The task is to count crossing bikers in such a way that each pair of crossing bikers (N, S), where 0<=N<S<T,
is passing when N is running to the north and S is running to the south.

23

Constraints:
<=N<S<T
Example -1:
Input:
5. -> Number of elements i.e. T
0. -> Value of 1st element
1. -> Value of 2nd element
0. -> Value of 3rd element
1. -> Value of 4th element
1. -> Value of 5th element
Output:
5
Explanation: */


import java.util.Scanner;

public class Ques5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int count=0;
        int[] arr = new int[T];
        for(int i =0;i<T;i++){   // taking input
            arr[i]=sc.nextInt();
        }
       /*     METHOD 1 
       for(int j=0;j<T;j++){
            if(arr[j]==0){
                for(int k=j;k<T-1;k++){
                    if(arr[k+1]==1){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

            */
            //METHOD 2
            int northbikers=0;
            for(int i =0;i<T;i++){
                if(arr[i]==0){
                    northbikers++;
                }
                else{
                    count+=northbikers;
                }
            }
            System.out.println(count);
    }
}