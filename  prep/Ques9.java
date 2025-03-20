/*Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered. 

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :

40 10 20 30 */



/*    Scanner  
import java.util.Scanner;
class Ques9{
public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 int N = input.nextInt();
 int k = input.nextInt();
 int[] arr = new int[N];
 int[] ans= new int[N];
 for(int i=0;i<N;i++){
    arr[i]= input.nextInt();
 }

 if(k>N){
    k=k%N;
 }
 for(int j=0;j<k;j++){
    ans[j]=arr[N-k+j];
 }
 //copy remaining elements
 int index=0;
 for(int j=k;j<N;j++){
    ans[j]=arr[index++];
 }
 for(int i=0;i<N;i++){
  System.out.println(ans[i]);
 }
 input.close();
}
}
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Ques9{
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] strArr= reader.readLine().trim().split("\\s+");
        int[] arr= Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();

        int k=Integer.parseInt(reader.readLine());
        int[] result= new int[N];
        if(k>N){
          k=k%N;
        }
        for(int i=0;i<k;i++){
            result[i]=arr[N-k+i];
        }
        int index=0;
        for(int j=k;j<N;j++){
            result[j]=arr[index++];
        }
   
        System.out.println(Arrays.toString(result).replace("["," ").replace("]","").replace(",",""));

    }
}