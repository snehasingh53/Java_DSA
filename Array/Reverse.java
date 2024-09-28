

public class Reverse{
    static  void reverseArray(int[] array, int start , int end )
{
    while (start < end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }
   for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
}
    

    public static void main(String[] args){
        int[] org_Array = {1,2,3,4,5,};
        int start =0;
        int end = org_Array.length-1;
        reverseArray( org_Array,  start ,  end);
        
    }
}