import java.util.Arrays;

public class CountingSort {

    public static void sort(int arr[]){
        int size=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]>size)
                    size=arr[i];
        }
        int auxArr[]=new int[size+1];
        for(int i=0;i<arr.length;i++){
            auxArr[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<auxArr.length ;i++){
            while(auxArr[i]>0)
            {
                arr[j]=i;
                j++;
                auxArr[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
