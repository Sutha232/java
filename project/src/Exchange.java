
public class Exchange {
    String[] MENU = { "USD", "JPY", "GPB", "EUR", "CNY", "BTC", "EXIT" };
    // MEMU is package ที่ import มา

    public void choosetype() {
        System.out.println("---------------------- CHOOSE MENU ---------------------");
        System.out.println("---------------------- FOR EXCHANGE  -----------------");
        for (int i = 0; i < MENU.length; i++) {
            int x = i + 1;
            System.out.println("                          " + x + "." + MENU[i]);
        }
    }
}