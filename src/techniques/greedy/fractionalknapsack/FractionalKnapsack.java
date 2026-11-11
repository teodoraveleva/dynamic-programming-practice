package techniques.greedy.fractionalknapsack;

import java.util.Scanner;

public class FractionalKnapsack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        int[] vrednost = new int[n];
        int[] tezina = new int[n];

        double[] r = new double[n];

        for (int i = 0; i < n; i++) {
            vrednost[i] = scanner.nextInt();
            tezina[i] = scanner.nextInt();
            r[i] = (double) vrednost[i] / tezina[i];
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r[i] > r[j]) {
                    double tmp = r[i];
                    r[i] = r[j];
                    r[j] = tmp;
                    int t1 = vrednost[i];
                    vrednost[i] = vrednost[j];
                    vrednost[j] = t1;
                    int t2 = tezina[i];
                    tezina[i] = tezina[j];
                    tezina[j] = t2;
                }
            }
        }

        double vkupno = 0;
        double preostanato = w;
        for (int i = 0; i < n; i++) {
            if (tezina[i] <= preostanato) {
                vkupno += vrednost[i];
                preostanato-=tezina[i];
            }
            else{
                vkupno+=r[i]*preostanato;
                break;
            }
        }
        System.out.printf("%.2f%n", vkupno);
    }
}
