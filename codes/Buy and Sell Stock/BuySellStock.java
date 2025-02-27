

public class BuySellStock {

    public static void maxProfit(int arr[]){
        int maxProfit=0;;
        int buyPrice=arr[0];
        int sellPrice=0;
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(buyPrice>arr[i]){
                buyPrice=arr[i];
                continue;
            }
             if(arr[i]>buyPrice)
                sellPrice=arr[i];
            profit=sellPrice-buyPrice;
               
            maxProfit=Math.max(maxProfit, profit);

        }
        System.out.println(maxProfit);


    }

        public static void main(String[] args) {
            int arr[]={7,1,5,3,6,4};
            maxProfit(arr);
        }
}
