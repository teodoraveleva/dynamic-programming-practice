package techniques.greedy.minimumaveragecompletiontime;

import java.util.Scanner;
import java.util.Arrays;

public class MinimumAverageCompletionTime {
    public static double resenie(int n, int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int zb=0,zbir=0;
        for(int i=0;i<n;i++){
            zb=zb+arr[i];
            zbir+=zb;
        }
        return (double)zbir/n;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.printf("%.2f%n", resenie(n,arr));
    }
}
