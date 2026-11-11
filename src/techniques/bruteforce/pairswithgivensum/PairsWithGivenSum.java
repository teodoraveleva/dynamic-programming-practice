package techniques.bruteforce.pairswithgivensum;

import java.util.Scanner;

public class PairsWithGivenSum {
    public static int solution_On2(int n, int[] arr, int k){
        int vk=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    vk++;
                }
            }
        }
        return vk;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        int k= scanner.nextInt();

        System.out.println(solution_On2(n,arr,k));

    }
}
