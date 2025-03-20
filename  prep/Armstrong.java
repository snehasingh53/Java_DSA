import java.util.Scanner;

public class Armstrong {
    
    public static boolean isArmstrong(int number) {
        int org_no = number, rem, result = 0;
        int digits = 0, temp = number;
        
        // Count the number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of digits raised to the power of 'digits'
        temp = number;
        while (temp != 0) {
            rem = temp % 10;
            result += Math.pow(rem, digits);
            temp /= 10;
        }

        return result == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        input.close(); // Always close the Scanner

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
