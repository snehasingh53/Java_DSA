import java.util.Scanner;

public class Ques2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N<1 || N>100){
            System.out.println("Wrong input");
        }
        else{
        String binNum = toBinary( N);
        System.out.println(binNum);
        String toggled = toggle(binNum);
        System.out.println(toggled);
        int decimal = conDecimal(toggled) ;
        System.out.print(decimal);
        }


    }
    public static String toBinary(int N){
     StringBuilder binary = new StringBuilder();
     while(N>0){
        binary.insert(0,N%2);
        N=N/2;
     }
     if(binary.length()==0){
        binary.append(0);
     }
     return binary.toString();
    }
    public static String toggle(String binary){
      StringBuilder toggled = new StringBuilder(binary);

      for(int i =0;i<binary.length();i++){
        if(binary.charAt(i)=='0'){
            toggled.setCharAt(i,'1');
        }else if(binary.charAt(i)=='1'){
            toggled.setCharAt(i,'0');
        }
      }
      return toggled.toString();

    }
    public static int conDecimal(String toggled){
        int decimal=0;
        int base=1; // 2^0 ==1
         for(int i=toggled.length()-1;i>=0;i--){
           if(toggled.charAt(i)=='1')
           {
            decimal+=base;
           }
           base*=2;
        }
        return decimal;
    }
}