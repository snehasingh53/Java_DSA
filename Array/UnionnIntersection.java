import java.util.ArrayList;
import java.util.List;


public class UnionnIntersection{

    public static List<Integer> getUnion(int[] arr1, int[] arr2){
        int left=0,right=0;
        int m = arr1.length;
        int n = arr2.length;
        List<Integer> union = new ArrayList<Integer>();

        while(left< m || right< n){
            //skip duplicaties
            while(left>0 && left<m && arr1[left]==arr1[left-1])
            {
                left++;
            }
             while(right>0 && right<n && arr2[right]==arr2[right-1])
            {
                right++;
            }

            //one array exhaust

            if(left >=m){
            union.add(arr2[right]);
             right++;
             continue;
            }
            else  if(right >=n){
            union.add(arr1[left]);
             left++;
             continue;
            }

            // comparison
            if(arr1[left]<arr2[right]){
                union.add(arr1[left]);
                left++;
            }
            else if(arr1[left]>arr2[right]){
                union.add(arr2[right]);
                right++;
            }else{
                union.add(arr1[left]);
                left++;
                right++;

            }
             
        }
        return union ;

    }

    public static void main(String[] args){
        int[] a ={1,1,1,2,2,3,3,3};
        int[] b ={3,3,3,4};
        List<Integer> union = getUnion(a,b);
        System.out.println("Union"+union);
    }
}