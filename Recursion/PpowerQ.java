import java.util.Scanner;
public class PpowerQ{
    static int pow(int base , int power){
        if (power==0) {
            return 0;
        }
        else if (power==1) {
            return base;
        }
        else {
         return pow(base,power-1)*base;
        }
    
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base number :");
        int p = in.nextInt();
        System.out.println("Enter the power :");
        int q = in.nextInt();
        int answer = pow(p,q);
        System.out.println("The answer  is "+ answer);

    }
}