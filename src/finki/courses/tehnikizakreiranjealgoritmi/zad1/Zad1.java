package finki.courses.tehnikizakreiranjealgoritmi.zad1;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int h = scanner.nextInt();
        long[] arr=new long[h];
        for(int i=0;i<h;i++){
            arr[i]= scanner.nextInt();
        }

        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
                if(arr[i]>arr[j]){
                    long tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        long broj=0;

        for(int j=0;j<h;j++){
            broj=broj*10+arr[j];
        }
        System.out.println(broj);

    }
}
