package techniques.dynamic.uniquepaths;

import java.util.Scanner;

public class UniquePaths {
    public static long solution(int m, int n){
        long[][] dp=new long[m][n];
        //dp[i][j] mi e brojot na cini da stignesh do poleto [i][j]
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
                if(i==0){
                    dp[0][j]=1;
                }
                if(j==0){
                    dp[i][0]=1;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(dp[i][j]==-1){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt(), n=scanner.nextInt();

        System.out.println(solution(m,n));
    }
}
