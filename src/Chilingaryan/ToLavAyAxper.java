package Chilingaryan;

import java.util.*;

public class ToLavAyAxper {
    public static void paymanner(int i,double T, LinkedList<Double> kapuxi1, LinkedList<Double> kapuxi2, LinkedList<Double> kapuxi3,
                                 LinkedList<Double> kapuxi4, LinkedList<Double> kapuxi5, LinkedList<Double> t, LinkedList<Double> azatmanJamank, LinkedList<Double> tSpasarkum,LinkedList<Double> tSpasum) {
        if (t.get(i) > azatmanJamank.get(0)) kapuxi1.add(tSpasarkum.get(i));
        else if(tSpasum.get(i) >= t.get(i-1) && (t.get(i) + azatmanJamank.get(i) + tSpasarkum.get(i) < T))
            kapuxi2.add(tSpasarkum.get(i));
        else if(tSpasum.get(i) >= t.get(i-1) && (t.get(i) + azatmanJamank.get(i) + tSpasarkum.get(i) < T))
            kapuxi3.add(tSpasarkum.get(i));
        else if(tSpasum.get(i) >= t.get(i-1) && (t.get(i) + azatmanJamank.get(i) + tSpasarkum.get(i) < T))
            kapuxi4.add(tSpasarkum.get(i));
        else if(tSpasum.get(i) >= t.get(i-1) && (t.get(i) + azatmanJamank.get(i) + tSpasarkum.get(i) < T))
            kapuxi5.add(tSpasarkum.get(i));
    }
    public static void main(String[] args) {
        LinkedList<Double> saxSpasarkumner = new LinkedList<>();
        int iteration = 0, mKapuxi = 6;
        double sigmaVerjin = 0;
        double  T = 100, nyu = 5, sigma = 1;
        double  spasmanLambda=  0.1, zAlfa = 1.98 ,epsilyon = 0,merVekalacT = 100,nAstxanish = 150,
                sumOf1 = 0, sumOf2 = 0, sumOf3 = 0, sumOf4 = 0, sumOf5 = 0, sumOf6 = 0, sumOfSax, sumOfT = 0, sumTau = 0;

        LinkedList<Integer> n = new LinkedList<>();
        LinkedList<Double> r = new LinkedList<>();
        LinkedList<Double> tSpasum = new LinkedList<>();
        LinkedList<Double> t = new LinkedList<>();
        LinkedList<Double> tau = new LinkedList<>();
        LinkedList<Double> kapuxi1 = new LinkedList<>();
        LinkedList<Double> kapuxi2 = new LinkedList<>();
        LinkedList<Double> kapuxi3 = new LinkedList<>();
        LinkedList<Double> kapuxi4 = new LinkedList<>();
        LinkedList<Double> kapuxi5 = new LinkedList<>();
        LinkedList<Double> kapuxi6 = new LinkedList<>();
        LinkedList<Double> merjvacneriHav = new LinkedList<>(); // en verji keti havna p(m)

        double fixvacChap = 0;
        double pmGcik;

        while (iteration++ < nAstxanish) {
            double n0 = 7, lambda = 5, k = 6, h = (int) Math.pow(2, k - 2), a = 3, b = 8, count = 0,m = (int) Math.pow(2, k);
            System.out.println("------------------------------------------------------ iteration[" + iteration + "]------------------------------------------------------");
            LinkedList<Double> azatmanJamank = new LinkedList<>();
            LinkedList<Double> tSpasarkum = new LinkedList<>();
            LinkedList<Double> sumOfArrays = new LinkedList<>();

            if(iteration < 2) {
                n.add((int) n0);
                for (int i = 0; i < T; ++i) {
                    n.add(i + 1, (int) (n.get(i) * lambda % m));
                    System.out.print("n[" + i + "] = " + n.get(i) + "   ");
                    r.add(i, n.get(i + 1) / m);
                    System.out.println("r[" + (i + 1) + "] = " + r.get(i));
                }
                System.out.println("\n• • • • • • • • • hayteridimelu jamanakahatvacner  • • • • • • • • •\n    • • • • • • • • • spasman jamanakner  • • • • • • • • •\n");
                for (int i = 0; sumTau + sumOfT < merVekalacT; ++i) {
                    tau.add(i, -(Math.log(r.get(i))) / spasmanLambda);
                    if (i == 0) {
                        t.add(0, tau.get(0));
                        sumOfT = t.get(i);
                    } else {
                        t.add(i, t.get(i - 1) + tau.get(i));
                        sumOfT = t.get(i);
                        sumTau = tau.get(i);
                    }
                    tSpasum.add(i, a + (b - a) * r.get(i));
                    if (t.get(i) > merVekalacT)
                        break;
                    System.out.print("tau[" + (i + 1) + "] = " + tau.get(i) + "   ");
                    System.out.print("t[" + (i + 1) + "] = " + t.get(i) + "    ");
                    System.out.println("t_spasum[" + (i + 1) + "] = " + tSpasum.get(i));
                }
            }
            fixvacChap = t.size();
            Random rand = new Random();
            for (int i = 0; i < t.size(); ++i) {
                double sum1 = 0;
                LinkedList<Double> sArray = new LinkedList<>();
                for (int j = 0; j < 12; ++j) {
                    int index = rand.nextInt(16);
                    sArray.add(r.get(index));
                    sum1 += sArray.get(j);
                }
                sumOfArrays.add(sum1);
            }
            System.out.println();
            for (int i = 0; i < t.size(); ++i) {
                System.out.print("s[" + (i + 1) + "] = " + sumOfArrays.get(i) + "         ");
                tSpasarkum.add(i, nyu + sigma * (sumOfArrays.get(i) - 6));
                System.out.println("t spasarkum [" + (i + 1) + "] = " + tSpasarkum.get(i));
                if ((t.get(i) + tSpasarkum.get(i) < merVekalacT)) {
                    count += 1;
                    saxSpasarkumner.add(tSpasarkum.get(i));
                    azatmanJamank.add(t.get(i) + tSpasarkum.get(i));
                }
            }
            for (int i = 0; i < azatmanJamank.size(); i++) {
                if (i == 0)
                    kapuxi1.add(tSpasarkum.get(i));
                else if (i == 1) {
                    if (t.get(i) < azatmanJamank.get(i - 1)) kapuxi2.add(tSpasarkum.get(i));
                    else kapuxi1.add(tSpasarkum.get(i));
                }
                else if (i == 2) {
                    if (t.get(i) > azatmanJamank.get(i - 2)) kapuxi1.add(tSpasarkum.get(i));
                    else if (t.get(i) > azatmanJamank.get(i - 1)) kapuxi2.add(tSpasarkum.get(i));
                    else kapuxi3.add(tSpasarkum.get(i));
                }
                else if(i==3) {
                    if (t.get(i) > azatmanJamank.get(i - 3)) kapuxi1.add(tSpasarkum.get(i));
                    else if (t.get(i) > azatmanJamank.get(i - 2)) kapuxi2.add(tSpasarkum.get(i));
                    else if (t.get(i) > azatmanJamank.get(i - 1))kapuxi3.add(tSpasarkum.get(i));
                    else kapuxi4.add(tSpasarkum.get(i));
                }
                else
                    paymanner(i, T,kapuxi1,kapuxi2,kapuxi3,kapuxi4,kapuxi5,t,azatmanJamank,tSpasarkum,tSpasum);
            }

            System.out.println(azatmanJamank);
            System.out.println("spasarkvele " + count + "  isk spasarkman havanakanutyun@ " + count / fixvacChap );
            double jlntoz = ((fixvacChap-count) / fixvacChap);
            merjvacneriHav.add(jlntoz);
        }
        pmGcik = (1 - (saxSpasarkumner.size() / (fixvacChap * nAstxanish)));
        for (Double aKapuxi1 : kapuxi1)sumOf1 += aKapuxi1;
        for (Double aKapuxi2 : kapuxi2)sumOf2 += aKapuxi2;
        for (Double aKapuxi3 : kapuxi3)sumOf3 += aKapuxi3;
        for (Double aKapuxi4 : kapuxi4)sumOf4 += aKapuxi4;
        for (Double aKapuxi5 : kapuxi5)sumOf5 += aKapuxi5;
        for (Double aKapuxi6 : kapuxi6)sumOf6 += aKapuxi6;

        int kZbaxvac = 0;
        //zbaxvac kapuxineri qanaki voroshum
            if(kapuxi1.size() > 0) kZbaxvac++;
            if(kapuxi2.size() > 0) kZbaxvac++;
            if(kapuxi3.size() > 0) kZbaxvac++;
            if(kapuxi4.size() > 0) kZbaxvac++;
            if(kapuxi5.size() > 0) kZbaxvac++;
            if(kapuxi6.size() > 0) kZbaxvac++;

        sumOfSax = sumOf1+sumOf2+sumOf3+sumOf4+sumOf5+sumOf6;
        double sumOfPer = 0;
        for (int i = 0; i < nAstxanish; i++) {
            sumOfPer += Math.pow(merjvacneriHav.get(i) - pmGcik,2);
        }
        sigmaVerjin = Math.sqrt(sumOfPer / (nAstxanish - 1));
        epsilyon = zAlfa * sigmaVerjin / Math.sqrt(nAstxanish);
        System.out.println(sumOfPer);

//        System.out.println("1 = " + kapuxi1.size()+ " 2 = " + kapuxi2.size() + " 3 = " + kapuxi3.size() + " \n4 = " + kapuxi4.size() + " 5 = " + kapuxi5.size() + " 6 = " + kapuxi6.size());
        System.out.println("\n\n\n•  spasarkman havanakanutyun = " + (saxSpasarkumner.size() / (t.size() * nAstxanish)));
        System.out.println("•  spasarkman toxunakutyun = " + (saxSpasarkumner.size() / (T * nAstxanish)));
        System.out.println("•  merjman havanakanutyun = " + (1-(saxSpasarkumner.size() / (t.size() * nAstxanish))) + "\n4)");
        for (int i = 0; i <= mKapuxi; i++) {
            switch (i){
                case 0:System.out.println("   " + (i + 1) + " kapuxu zbaxvacutyan havanakanutyun@ = " + sumOf1 / (T * nAstxanish * (i+1 )));break;
                case 2:System.out.println("   " + (i ) + " kapuxu zbaxvacutyan havanakanutyun@ = " + sumOf2 / (T * nAstxanish * (i)));break;
                case 3:System.out.println("   " + (i) + " kapuxu zbaxvacutyan havanakanutyun@ = " + sumOf3 / (T * nAstxanish * (i)));break;
                case 4:System.out.println("   " + (i) + " kapuxu zbaxvacutyan havanakanutyun@ = " + sumOf4 / (T * nAstxanish * (i )));break;
                case 5:System.out.println("   " + (i) + " kapuxu zbaxvacutyan havanakanutyun@ = " + sumOf5 / (T * nAstxanish * (i)));break;
                case 6:System.out.println("   " + (i) + " kapuxu zbaxvacutyan havanakanutyun@ = " + sumOf6 / (T * nAstxanish * (i)));break;
            }
        }
        System.out.println("   amboxj kapuxu zbaxvacutyan havanakanutyun@ = "
                + ((sumOf1 / (T * nAstxanish)) + (sumOf2 / (T * nAstxanish * (2))) +(sumOf3 / (T * nAstxanish * (3)))
                + (sumOf4 / (T * nAstxanish * (4)))+(sumOf5 / (T * nAstxanish * (5)))+(sumOf6 / (T * nAstxanish * (6)))));
        double zbaxvacutyun1 = sumOf1 / nAstxanish, zbaxvacutyun2 = sumOf2 / nAstxanish, zbaxvacutyun3 = sumOf3 / nAstxanish,
                zbaxvacutyun4 = sumOf4 / nAstxanish, zbaxvacutyun5 = sumOf5/nAstxanish, zbaxvacutyun6 = sumOf6/nAstxanish;
        System.out.println("•  yuraqanchyur kapuxu zbaxvacutyan mijin jamanak " + zbaxvacutyun1);
        System.out.println("                                                   " + zbaxvacutyun2);
        System.out.println("                                                   " + zbaxvacutyun3);
        System.out.println("                                                   " + zbaxvacutyun4);
        System.out.println("                                                   " + zbaxvacutyun5);
        System.out.println("                                                   " + zbaxvacutyun6);
        System.out.println("•  zbaxvac kapuxineri mijin qanak " + kZbaxvac);
        System.out.println("•  parapurti havanakanutyun = " + ((T - (sumOf1+sumOf2+sumOf3+sumOf4+sumOf5+sumOf6) / T) / nAstxanish));
        System.out.println("•  amboxj hamakargi parapurti havanakanutyun@ = " + (1 - + ((sumOf1 / (T * nAstxanish)) + (sumOf2 / (T * nAstxanish * (2))) +(sumOf3 / (T * nAstxanish * (3)))
                + (sumOf4 / (T * nAstxanish * (4)))+(sumOf5 / (T * nAstxanish * (5)))+(sumOf6 / (T * nAstxanish * (6))))));
        System.out.println("• hayti spasakman mijin jamamank = " + (sumOfSax / saxSpasarkumner.size()));
        System.out.println("• hamakargum hayti gtnvelu mijin jamanak@ = " + ((sumOf1 + sumOf2+ sumOf3) / saxSpasarkumner.size()));
        System.out.println("• " + sigmaVerjin);
        System.out.println("• " + epsilyon);
        System.out.println("ese nenc nafsyaki \narajin kapuxov spasarkvele " + kapuxi1.size() + " hayt \n"
                + "erkrord kapuxov spasarkvela   " + kapuxi2.size()+ " hayt \n" + "errord kapuxov spasarkvela   " +kapuxi3.size()+ " hayt \n"
                +"chorrord kapuxov spasarkvela   " + kapuxi4.size() + " hayt \n" +"hingerord kapuxov spasarkvela   " + kapuxi5.size() + " hayt\n" +
                "vecerord kapuxov spasarkvela    "+ kapuxi6.size() + " hayt"+ "\nsax spasarkum" + saxSpasarkumner.size());
        System.out.println(sumOf1 + " " + sumOf2);
    }
}
