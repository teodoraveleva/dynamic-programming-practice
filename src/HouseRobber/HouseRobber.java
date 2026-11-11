package HouseRobber;

import java.util.Scanner;

public class HouseRobber {
    public static long resenie(int n, long[] nums){
        long[] maxSum=new long[n];
        maxSum[0]=nums[0];
        if(n==1){
            return maxSum[0];
        }
        maxSum[1]=nums[1];
        if(n==2){
            return Math.max(maxSum[0],maxSum[1]);
        }
        maxSum[2]=Math.max(nums[2]+maxSum[0], maxSum[1]);

        long maxx=Math.max(maxSum[0],maxSum[1]);
        long max=Math.max(maxx,maxSum[2]);

        for(int i=3;i<n;i++){
            long a = nums[i]+maxSum[i-2];
            long b = nums[i]+maxSum[i-3];
            maxSum[i]=Math.max(a,b);
            if(max<maxSum[i]){
                max=maxSum[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        long[] nums=new long[n];
        for(int i=0;i<n;i++){
            nums[i]= scanner.nextLong();
        }

        System.out.println(resenie(n,nums));
    }
}

