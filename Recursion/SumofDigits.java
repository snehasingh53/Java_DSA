import java.util.Scanner;
public class SumofDigits{
    static int SoD(int number ){
        if (number>=0 && number<=1){
            return number;
        }
        else {
            return (SoD(number/10)+number%10);
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int answer = SoD(num);
        int count = countDigits(num);
        System.out.println("The sum of digits of " +num +"is" + answer);
        System.out.println("The count of digits in " +num +" is " + count);
    }
    static int countDigits(int number){
       
        if (number ==0){
            return 0;
        }
        else if (number <=10){
            return 1;
        }
        else {
            return 1 +countDigits(number/10);
        }  
        

    }
}