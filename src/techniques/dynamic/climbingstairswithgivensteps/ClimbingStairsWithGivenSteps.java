package techniques.dynamic.climbingstairswithgivensteps;


import java.util.Scanner;

public class ClimbingStairsWithGivenSteps {
    public static long resenie(int n, int k, int[] steps){
        long[] dp=new long[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<k;j++){
                if(i-steps[j]>=0){
                    dp[i]+=dp[i-steps[j]];
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int[] steps= new int[k];

        for(int i=0;i<k;i++){
            steps[i]= scanner.nextInt();
        }
        System.out.println(resenie(n,k,steps));
    }
}
