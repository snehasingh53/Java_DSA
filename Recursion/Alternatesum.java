
import java.util.Scanner;

public class Alternatesum{
    static int alternatesum(int num){
     if (num == 0) return 0;
     else if (num%2==0){
        return alternatesum(num-1)-num;
     }
     else return alternatesum(num-1)+num;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till where u want to find alternate sum ");
        int num = input.nextInt();
        int sum=alternatesum(num);
        System.out.println("The alternate sum of series " + sum );

    } 
}