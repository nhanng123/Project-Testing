package src.commission;

public class Commission {
    static double lockPrice = 50.0;
    static double stockPrice = 40.0;
    static double barralesPrice = 30.0;

    public static double calSale(double totalLocks, double totalStocks, double totalBarrales) {
        double lockSales = lockPrice * totalLocks;
        double stockSales = stockPrice * totalStocks;
        double barraelSale = barralesPrice * totalBarrales;

        return lockSales + stockSales + barraelSale;
    }

    public static double calCommission(double totalLocks, double totalStocks, double totalBarrales) {

        boolean c1, c2, c3;
        double commission;
        double sales = calSale(totalLocks,totalStocks,totalBarrales);
        c1 = (1 <= totalLocks) && (totalLocks <= 80);

        c2 = (1 <= totalStocks) && (totalStocks <= 90);

        c3 = (1 <= totalBarrales) && (totalBarrales <= 100);

        if (!c1 || !c2 || !c3)
           commission =  0.0;
        else {

            if (sales > 1800) {
                commission = 0.10 * 1000.0;
                commission = commission + 0.15 * 800;
                commission = commission + 0.20 * (sales - 1800.0);
            } else if (sales > 1000) {
                commission = 0.10 * 1000;
                commission = commission + 0.15 * (sales - 1000);
            } else
                commission = 0.10 * sales;
        }
        return commission;
    }

}
