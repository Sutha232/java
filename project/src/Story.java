import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Exchange menu = new Exchange();
        double ex = 0;
        menu.choosetype();

        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            System.out.print("Please choose option : ");
            int exchange = sc.nextInt();
            switch (exchange) {
            case 1: {
                System.out.print("Enter the number of USD : ");
                double usd = sc.nextDouble();
                if (usd >= 0) {
                    double bath = usd * 32;
                    System.out.println("");
                    System.out.println(usd + " USD is " + bath + " Bath");
                    System.out.println("");
                    ex = ex + bath;

                } else {
                    System.out.println("Please put in positive number of USD");
                }
            }
                break;
            case 2: {
                System.out.print("Enter the number of JPY : ");
                double jpy = sc.nextDouble();
                if (jpy >= 0) {
                    double bath = jpy * 0.29;
                    System.out.println("");
                    System.out.println(jpy + " JPY is " + bath + " Bath");
                    System.out.println("");
                    ex = ex + bath;
                } else {
                    System.out.println("Please put in positive number of JPY");
                }
            }
                break;
            case 3: {
                System.out.print("Enter the number of GPB : ");
                double gpb = sc.nextDouble();
                if (gpb >= 0) {
                    double bath = gpb * 42.74;
                    System.out.println("");
                    System.out.println(gpb + " GPB is " + bath + " Bath");
                    System.out.println("");
                    ex = ex + bath;
                } else {
                    System.out.println("Please put in positive number of GPB");
                }
            }
                break;
            case 4: {
                System.out.print("Enter the number of EUR : ");
                double eur = sc.nextDouble();
                if (eur >= 0) {
                    double bath = eur * 36.79;
                    System.out.println("");
                    System.out.println(eur + " EUR is " + bath + " Bath");
                    System.out.println("");
                    ex = ex + bath;
                } else {
                    System.out.println("Please put in positive number of EUR");
                }
            }
                break;
            case 5: {
                System.out.print("Enter the number of CNY : ");
                double cny = sc.nextDouble();
                if (cny >= 0) {
                    double bath = cny * 4.76;
                    System.out.println("");
                    System.out.println(cny + " CNY is " + bath + " Bath");
                    System.out.println("");
                    ex = ex + bath;
                } else {
                    System.out.println("Please put in positive number of CNY");
                }
            }
                break;
            case 6: {
                System.out.print("Enter the number of BTC : ");
                double btc = sc.nextDouble();
                if (btc >= 0) {
                    double bath = btc * 1706113;
                    System.out.println("");
                    System.out.println(bath + " BTC  is " + bath + " Bath");
                    System.out.println("");
                    ex = ex + bath;
                } else {
                    System.out.println("Please put in positive number of BTC ");
                }
            }
                break;
            case 7: {
                x = x + 1;

            }
                System.out.println("---------------- TOTAL EXCHANGE ---------------------");
                System.out.println("         You total exchange money is " + ex + " bath");
                System.out.println(" ");
            }

        }
    }
}
