package src.commission;

public class RobustBVA_Commission {
    static double minLock = 1.00;
    static double maxLock = 80.0;
    static double nomLock = 40.5;
    static double minStock = 1.00;
    static double maxStock = 90;
    static double nomStock = 45.5;
    static double minBarrel = 1.00;
    static double maxBarrel = 100;
    static double nomBarrel = 50.5;

    static double[] lockValues = new double[]{minLock - 1, minLock, minLock + 1, nomLock, maxLock - 1, maxLock, maxLock + 1};
    static double[] stockValues = new double[]{minStock - 1, minStock, minStock + 1, maxStock - 1, maxStock, maxStock + 1};
    static double[] barrelValues = new double[]{minBarrel - 1, minBarrel, minBarrel + 1, maxBarrel - 1, maxBarrel, maxBarrel + 1};

    public static void generateTestcases() {
        int count = 1;
        StringBuilder out = new StringBuilder();
        out.append("Test case\t\tA\t\tB\t\tC\t\tExpected output\n");
        //    Lock change
        for (double value : lockValues) {
            double result = Commission.calCommission(value, nomStock, nomBarrel);
            out.append("\t\t" + count++ + "\t\t" + value + "\t\t" + nomStock + "\t\t" + nomBarrel + "\t\t" + result+"\n");
        }
        //    Stock change
        for (double value : stockValues) {
            double result = Commission.calCommission(nomLock, value, nomBarrel);
            out.append("\t\t" + count++ + "\t\t" + nomStock + "\t\t" + value + "\t\t" + nomBarrel + "\t\t" + result+"\n");
        }
        //    Barrel change
        for (double value : barrelValues) {
            double result = Commission.calCommission(nomLock, value, nomBarrel);
            out.append("\t\t" + count++ + "\t\t" + nomStock + "\t\t" + nomStock + "\t\t" + value + "\t\t" + result+"\n");
        }

        System.out.println(out);
    }
}
