package techniques.dynamic.MinimumPathSum;

import java.util.Scanner;

public class MinimumPathSum {
    public static long solution(int m, int n, int[][] grid){
        long[][] dp=new long[m][n];

        dp[0][0]=grid[0][0];
        for(int j=1;j<n;j++){
            dp[0][j]+=dp[0][j-1] + grid[0][j];
        }
        for(int j=1;j<m;j++){
            dp[j][0]+=dp[j-1][0] + grid[j][0];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j]+grid[i][j], dp[i][j-1]+grid[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m-1][n-1];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();

        int[][] grid=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=scanner.nextInt();
            }
        }
        System.out.println(solution(m,n,grid));
    }
}
