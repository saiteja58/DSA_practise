public class BubbleSort{

    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1])
                    {
                        
                        arr[j]=arr[j]^arr[j+1];
                        arr[j+1]=arr[j]^arr[j+1];
                        arr[j]=arr[j]^arr[j+1];
                        
                    }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {5,4,1,3,2};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

}