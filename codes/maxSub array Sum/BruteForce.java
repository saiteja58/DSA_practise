public class BruteForce {


    //time complexity = O(n^3)
    public static void subArrayMaxSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];

                }
                if(currSum>maxSum)
                    maxSum=currSum;
            }
        }
        System.out.println("Max Sum = "+maxSum);

    }
    
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        subArrayMaxSum(arr);   //ans = 7
    }
}
