package techniques.dynamic.ClimbingStairs123;

import java.util.Scanner;

public class ClimbingStairs123 {
    public static long resenie(int n){
        if(n <= 2) return n;
        if(n == 3) return 4;
        long[] dp=new long[n+1];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println(resenie(n));

    }
}
