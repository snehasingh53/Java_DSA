import java.util.Scanner;

public class Ques1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str= input.next();
        int countX=0, countH=0;
        for (int i =0;i<str.length();i++){
            if(str.charAt(i) =='#'){
                countH++;
            }
            else if (str.charAt(i) =='*'){
                countX++;
            }
           
        }
        System.out.println(countX-countH);
    }
}