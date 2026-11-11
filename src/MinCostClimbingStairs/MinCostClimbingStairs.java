package MinCostClimbingStairs;

import java.util.Scanner;

public class MinCostClimbingStairs {
    public static long solution(int n, long[] cost){
        long[] minCost=new long[n+1];
        minCost[0]=0;
        minCost[1]=0;
        for(int i=2;i<=n;i++){
            long a=minCost[i-1]+cost[i-1];
            long b=minCost[i-2]+cost[i-2];
            minCost[i]=Math.min(a,b);
        }
        return minCost[n];
    }
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        long[] cost=new long[n+1];
        for(int i=0;i<n;i++){
            cost[i]= scanner.nextLong();
        }
        cost[n]=0;
        long resenie=solution(n,cost);
        System.out.println(resenie);


    }
}
