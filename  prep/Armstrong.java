import java.util.Scanner;
public class Armstrong {

public boolean main(String args[]){
 
 System.out.println("Enter the number ")
 Scanner input = new Scanner(System.in)
   int number=input.nextInt;
int org_no=number;
int rem=0, result=0;
int digits=0, temp = number;
while(temp>0){
rem=temp/10;
digits++;

}
while(org_no!=0){
  rem= org_no%10;
  result+=Math.pow(rem,digits);
  org_np/=10;
}
if(result==number){
 return true;
}else{
 return false;
}

}
}