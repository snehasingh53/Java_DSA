import java.util.Scanner;

/*public class Recursion {
    public static void main(String[] args){
        System.out.print("ENter the number of term ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printIncreasing(n);
    }
    static void printIncreasing(int num) { 
    if (num==1){
        System.out.print(1);
        return ;
    }
    else{
        printIncreasing(num-1);
        System.out.print(num);
    }
    
    }
}
    */

 // ----------------------------------------------------------------//
                        // print all natural numbers from n tp 1 

public class Recursion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number  from which u want to print natural numbers");
        int n= input.nextInt();
        printDecreasing(n);
    }
    static void printDecreasing(int num){
        if (num >1){
            System.out.print(num);
            printDecreasing(num-1);
            return ;
        }
        else {
           
            System.out.print(1);
        }
    }

}