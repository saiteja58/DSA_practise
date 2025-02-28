public class SelectionSort {


    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                minPos=arr[minPos]>arr[j]?j:minPos;
           }
           arr[minPos]=arr[minPos]^arr[i];
           arr[i]=arr[minPos]^arr[i];
           arr[minPos]=arr[minPos]^arr[i];

        }
        
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
