
/* Given an integer N . Print the sum of the numbers of the multiplication table of N . 
 
i/p format : first and the only line contains the value of N 
o/p stream: single integer
sample input: 6 
sample out: 330
    
*/

//    Using Scanner class

/* 
import java.util.Scanner;
 class Ques8{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int table=0;
        int sum=0;
        for(int i=1;i<=10;i++){
            table=i*N;
            sum= sum+table;
        }
        System.out.println(sum);

    }
 }

 */

// using BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ques8{
    public static void main(String args[]) throws IOException{   
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int table=0;
        int sum=0;
        for(int i =1;i<=10;i++){
           table=i*N;
           sum+=table;
        }
        System.out.println(sum);
    }
}
    


