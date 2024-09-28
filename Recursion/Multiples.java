import java.util.Scanner;

public class Multiples{
    static void multiples(int num, int K){
     if(K <=0) return;
     multiples(num,K-1);
     System.out.println(num*K); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        System.out.println("Enter the value of K :");
        int K = input.nextInt();
       multiples(num, K);
      

    }
}