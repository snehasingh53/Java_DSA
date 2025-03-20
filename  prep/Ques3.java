import java.util.Scanner;


public class Ques3{
    public static void main(String args[]){
        
        Scanner input =new Scanner(System.in);
       int size=input.nextInt();
       int[] arr= new int[size];
       for(int i =0;i<size;i++){
        arr[i]=input.nextInt();
       }
       bubbleSort(arr,size);
       int minSum=arr[0];
       for(int j=1;j<=size-1;j++){
        if(arr[j]==arr[j-1]){
            arr[j]+=1;
        }
        minSum+=arr[j];
    }
        System.out.println(minSum);
       

    }
    public static void bubbleSort(int[] arr,int n){
        for(int i =0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }

    }
}