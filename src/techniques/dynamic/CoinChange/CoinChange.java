package techniques.dynamic.CoinChange;

import java.util.Scanner;

public class CoinChange {

    // za sekoj i se prasuvame koja bila poslednata moneta

    // 1  3 4 - 6
    // 1 1 -1 -1 -1 1 -1 -1
    public static long resenie(int n, int[] coins, int amount){
        long[] dp=new long[amount+1];

        for(int i=1;i<=amount;i++){
            dp[i]=amount+1;
        }

        dp[0]=0;

        for(int i=1;i<=amount;i++){
            for(int j=0;j<n;j++){
                if(i-coins[j]>=0){
                    dp[i]=Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        if(dp[amount]>amount){
            return -1;
        }
        return dp[amount];
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n = scanner.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=scanner.nextInt();
        }
        int amount=scanner.nextInt();

        resenie(n,coins,amount);
    }
}
