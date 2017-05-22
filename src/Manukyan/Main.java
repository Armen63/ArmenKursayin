package Manukyan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        double C = 120, W = 100;
        double E = Math.E, lambda = 0.000001;
        List<Integer> c = new ArrayList<>();
        List<Integer> w = new ArrayList<>();
        List<Double> p = new ArrayList<>();
        double sumOfC = 0, sumOfW = 0, sumOfP = 0;


        c.add(4);
        c.add(6);
        c.add(12);
        c.add(10);
        c.add(5);
        c.add(8);
        c.add(10);

        w.add(4);
        w.add(8);
        w.add(7);
        w.add(3);
        w.add(5);
        w.add(3);
        w.add(6);

        p.add(0.9);
        p.add(0.85);
        p.add(0.88);
        p.add(0.75);
        p.add(0.9);
        p.add(0.8);
        p.add(0.75);
        for (int i = 0; i < c.size(); i++) {
            sumOfC += c.get(i);
            sumOfP += p.get(i);
            sumOfW += w.get(i);
        }
        double Cshtrix = C - sumOfC;
        double ff[][] = new double[8][];
        double phi[][] = new double[8][(int) (Cshtrix+1)];
        double indexner[][] = new double[8][(int) (Cshtrix+1)];

        int m1;
        for (int z = 0; z <= Cshtrix; z++) {
            double maxFF = 0;
            int indexOfFF= 0;
            ff[0] = new double[(int) Cshtrix + 1];
            m1 = z / c.get(0);
            for (int m = 0; m <= m1; m++) {
                ff[0][m] = (1 - Math.pow(1 - p.get((0)), m+1 ))*(Math.pow(E, -lambda * 8 * m));
                if(ff[0][m] > maxFF){
                    maxFF = ff[0][m];
                    indexOfFF = m;
                }
            }
            phi[0][z] = maxFF;
            indexner[0][z] = indexOfFF;
            System.out.println((z) + "     " + maxFF + "   m = "+indexOfFF);
        }

        double[][] fi = new double[8][(int) (Cshtrix)];

        fi[0] = ff[0];
        int indexOfmax = 0;
        for (int n = 1; n < 7; n++) {
            System.out.println("phi " + (n+1));
            for (int z = 0; z <= Cshtrix; z++) {
                m1 = (int) Math.floor(z / c.get(n));
                double arr[] = new double[z + 1];
                double maxElement = 0.0;
                for (int m = 0; m <= m1; m++) {
                    arr[m] = (Math.pow(E, -lambda * w.get(n) * m)) * (1 - Math.pow(1 - p.get((n)), m+1 )) *phi[n - 1][z - c.get(n)*m];
                    if (maxElement < arr[m]) {
                        maxElement = arr[m];
                        indexOfmax = m;
                    }
                }
                System.out.println(z  + "    " + maxElement + "   m = " + indexOfmax);
                phi[n][z] = maxElement;
                indexner[n][z] = indexOfmax;
            }
            System.out.println("---------------------------------------");
        }
//        System.out.println(indexner[6][65]);
//        System.out.println(indexner[5][65-w.get(0)]);
//        System.out.println(indexner[4][65-w.get(1)-w.get(0)]);
//        System.out.println(indexner[3][65-w.get(2)-w.get(1)-w.get(0)]);
//        System.out.println(indexner[2][65-w.get(3)-w.get(2)-w.get(1)-w.get(0)]);
//        System.out.println(indexner[1][65-w.get(4)-w.get(3)-w.get(2)-w.get(1)-w.get(0)]);
//        System.out.println(indexner[0][65-w.get(5)-w.get(4)-w.get(3)-w.get(2)-w.get(1)-w.get(0)]);

        LinkedList<Integer> sss = new LinkedList<>();
        sss.add(1);
        sss.add(1);
        sss.add(1);
        sss.add(2);
        sss.add(2);
        sss.add(3);
        sss.add(4);
        double summ = 0;
        for (int i = 0; i < sss.size(); i++) {
            summ += sss.get(i)*w.get(w.size() - 1 -i);
        }
        System.out.println(summ);
       System.out.println((1 - Math.pow(1 - p.get((0)), 5+1 ))*(Math.pow(E, -lambda * 8 * 5)));
    }
}