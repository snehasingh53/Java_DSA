
import java.util.Scanner;
public class RevDigit{
public static void main(String args[]){
 Scanner input = new Scanner(System.in); 

 System.out.println("Enter the number");
 int no = input.nextInt();

 int rev_no= reverseDigit(no);
 System.out.println("The reverse of " +no +" is "+ rev_no);
}
public static int reverseDigit(int n){
 int rem=0, rev=0;
 while(n!=0){
 rem=n%10; // give last digit
 rev= rev*10+rem;
 n/=10;
 }
 return rev;
}
}
