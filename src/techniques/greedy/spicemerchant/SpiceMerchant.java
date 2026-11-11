package techniques.greedy.spicemerchant;

import java.util.Scanner;

public class SpiceMerchant {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int c=scanner.nextInt();

        int[] p=new int[n];
        int[] a=new int[n];

        double[] pergram=new double[n];

        for(int i=0;i<n;i++){
            p[i]= scanner.nextInt();
            a[i]= scanner.nextInt();
            pergram[i]=(double) p[i]/a[i];

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(pergram[i]>pergram[j]){
                    int tmp=a[i]; a[i]=a[j]; a[j]=tmp;
                    tmp=p[i]; p[i]=p[j]; p[j]=tmp;
                    double tmpp=pergram[i]; pergram[i]=pergram[j]; pergram[j]=tmpp;
                }
            }
        }
        double vkupno=0;
        for(int i=0;i<n;i++){
            if(a[i]<=c) {
                vkupno += p[i];
                c-=a[i];
            }
            else{
                vkupno+=(c*pergram[i]);
                break;
            }
        }
        System.out.printf("%.2f%n", vkupno);
    }
}
