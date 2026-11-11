package ClimbingStairs;

//ili edno skalilo ili 2 skalila

import java.util.Scanner;

public class ClimbingStairs {
    //sto mi e dp[i]
    //dp[i]=br na nacini da stigneme do skalilo i

    //kako se dobiva dp[i] od pomalite
    //dp[i]=dp[i-1]+dp[i-2]

    //najmalite slucaevi sto gi znaeme se
    //dp[1]=1
    //dp[2]=2

    //krajniot odgovor e dp[n] polnime i=3,4,...,n

    public static long solution(int n, long[] dp){
        dp[1]=1;
        dp[2]=2;

        if(n<3){
            return n;
        }

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        long[] dp=new long[n+1];

        System.out.println(solution(n,dp));
    }



}
