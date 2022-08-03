package ru.netology.stats;


public class StatsService {

    public long sumSales(long[] sales) {


        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public double meanSales(long[] sales) {

        long sumSales = sumSales(sales);
        double meanSales = sumSales / (sales.length);
        return meanSales;
    }

    public long maxSales(long[] sales) {

        int monthOfMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthOfMaxSales] <= sales[i]) {
                monthOfMaxSales = i;
            }
        }

        monthOfMaxSales = monthOfMaxSales + 1;
        return monthOfMaxSales;
    }

    public long minSales(long[] sales) {

        int monthOfMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthOfMinSales] >= sales[i]) {
                monthOfMinSales = i;
            }
        }

        monthOfMinSales = monthOfMinSales + 1;
        return monthOfMinSales;
    }

    public long monthsBelowMeanSales(long[] sales) {

        int monthsBelowMeanSales = 0;
        double meanSales = meanSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < meanSales) {
                monthsBelowMeanSales = monthsBelowMeanSales + 1;
            }
        }
        return monthsBelowMeanSales;
    }

    public long monthsAboveMeanSales(long[] sales) {

        double meanSales = meanSales(sales);
        int monthsAboveMeanSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > meanSales) {
                monthsAboveMeanSales = monthsAboveMeanSales + 1;
            }
        }
        return monthsAboveMeanSales;
    }

}
