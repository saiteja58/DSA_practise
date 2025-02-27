public class KadanesAlgo {
    

    public static void maxSumSubArray(int arr[]){
        int minusChecker=0;
        int negMaxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                minusChecker++;
            if(negMaxSum<arr[i])
                negMaxSum=arr[i];
            
        }
        if(minusChecker==arr.length)
            {
                System.out.println("max sum = "+negMaxSum);
                return;
            }
        

        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length;i++){
            
            currSum+=arr[i];
            if(currSum<0)
                currSum=0;
            if(currSum>maxSum)
                maxSum=currSum;
        
        }

        System.out.println("max sum = "+maxSum);
        
           
        
            
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSumSubArray(arr);  //ans = 7

        int arr1[]={-2,-3,-1,-4};
        maxSumSubArray(arr1);  //ans = -1
    }
}
