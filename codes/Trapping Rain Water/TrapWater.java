

public class TrapWater {


    public static void rainWater(int arr[]){
        int areaRain = 0;
        int leftMax[]=new int[arr.length];
        int rightMax[]=new int[arr.length];
        leftMax[0]=arr[0];
        rightMax[arr.length-1]=arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            leftMax[i]=leftMax[i-1]<arr[i]?arr[i]:leftMax[i-1];
        }
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i]=rightMax[i+1]<arr[i]?arr[i]:rightMax[i+1];
        }
        for(int i=0;i<arr.length;i++){
            areaRain+=Math.min(leftMax[i], rightMax[i])-arr[i];
        }
        System.out.println(areaRain);

    }

    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        rainWater(arr);
    }
}
