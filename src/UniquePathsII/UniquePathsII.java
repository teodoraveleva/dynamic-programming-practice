package UniquePathsII;

import java.util.Scanner;

public class UniquePathsII {
    public static void solution(int m, int n, long[][] grid){
        long[][] dp=new long[m][n];
        dp[0][0]=0;
        if(grid[0][1]!=1){
            dp[0][1]=1;
        }
        if(grid[1][0]!=1){
            dp[1][0]=1;
        }
        if(grid[0][1]==1 && grid[1][0]==1){
            System.out.println("ne moze da se pomrdne od startot");
        }
        for(int i=0;i<m;i++){
            if(grid[i][0]!=1){
                dp[i][0]=1;
            }
            else{
                break;
            }
        }

        for(int j=1;j<n;j++){
            if(grid[0][j]!=1){
                dp[0][j]=1;
            }
            else{
                break;
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]!=1){
                    if(grid[i-1][j]!=1 && grid[i][j-1]!=1){
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                    if(grid[i-1][j]==1 && grid[i][j-1]!=1){
                        dp[i][j]=dp[i][j-1];
                    }
                    if(grid[i-1][j]!=1 && grid[i][j-1]==1){
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int m= scanner.nextInt();
        int n= scanner.nextInt();

        long[][] grid=new long[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]= scanner.nextLong();
            }
        }
        solution(m,n,grid);
    }
}
