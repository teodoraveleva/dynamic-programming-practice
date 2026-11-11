package finki.labs.lab4.lab4doma;

import java.util.Scanner;

public class zab4doma {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        long[] vreme=new long[n];
        long[] tezina=new long[n];
        for(int i=0;i<n;i++){
            vreme[i]=scanner.nextInt();
            tezina[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(vreme[i]*tezina[j] < vreme[j]*tezina[i]){
                    long tmp=vreme[i]; vreme[i]=vreme[j]; vreme[j]=tmp;
                    long tmp2=tezina[i]; tezina[i]=tezina[j]; tezina[j]=tmp2;
                }
            }
        }
        long[] pocnuva=new long[n];
        pocnuva[0]=0;
        long cena=0;
        for(int i=1;i<n;i++){
            pocnuva[i]=pocnuva[i-1]+vreme[i-1];
            cena+=pocnuva[i]*tezina[i];
        }
        System.out.println(cena);
    }
}
