
public class PreFixSum {


    //time Complexity = O(n^2)
    public static void maxSumSubArray(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefixArr[]=new int[arr.length];
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
          
            for(int j=i;j<arr.length;j++){
                currSum=(i==0)?prefixArr[j]:prefixArr[j]-prefixArr[i-1];
                if(currSum>maxSum)
                maxSum=currSum;
            }
            
        }

        System.out.println("max sum = "+maxSum);
    }

    public static void main(String[] args) {

        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSumSubArray(arr);;
    }
}
