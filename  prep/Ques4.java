/*A party has been organised on a cruise. The party is organised for a limited time(T). The number of
guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The
task is to find the maximum number of guests present on the cruise at any given instance within T hours.
Example 1:
Input:
5 ---> Value of T
[7,0,5,1,3] ---> E[], element of E[0] to E[N-1], where input each element is separated by new line
[1,2,1,3,4] -----> L[],element of L[0] to L[N-1], where input each element is separated by new line
Output:
8 -----> Maximum number of guests on cruise at an instance. */



import java.util.Scanner;

public class Ques4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] entry = new int[size];
        int[] left = new int[size];
      
        for(int i =0;i<size;i++){
            entry[i]=sc.nextInt();
        }
     
        for(int i =0;i<size;i++){
            left[i]=sc.nextInt();
        }
         /*    METHOD 1
        int[] resArr= new int[size];

      
        resArr[0]= entry[0]-left[0];
        for(int j=1;j<size;j++){
            resArr[j]= resArr[j-1]+(entry[j]-left[j]);
        }
    
            for(int i =0;i<size-1;i++){
                for(int j =0;j<size-i-1;j++){
                    if(resArr[j]>resArr[j+1]){
                        int temp = resArr[j];
                        resArr[j]= resArr[j+1];
                        resArr[j+1] = temp;
                    }
                }
            }
            System.out.println(resArr[size-1]);
            */

            // Method 2 
            int currentGuest=0;
            int maxGuest=0;
            for(int i =0;i<size;i++){
                currentGuest+=entry[i]-left[i];
                maxGuest=Math.max(currentGuest,maxGuest);
            }
            System.out.println(maxGuest);
    }
}