import java.util.Scanner;
public class FactorialnFibonacci{
    static int factorial(int number){
        if(number==0 ||number==1){
            return 1  ;
        }
        else{
              return number*factorial(number-1);
             
           
        }

    }
    static int Fib(int number){
        if(number==0){
            return 0 ;
        }
        else if (number==1){ 
           return 1;
        }
        else{
            return Fib(number-1)+Fib(number-2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number whose factorial u need to find ");
        int num = input.nextInt();
        System.out.println("Enter a number whose fibonacci u need to find ");

        
        int n = input.nextInt();
        int answer= factorial(num);
        System.out.println("The factorial of " +num + " is " + answer);
        int result = Fib(n);
        System.out.println("The fibonacci of " + num + " is " + result);

    }
}