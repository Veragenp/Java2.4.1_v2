package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales = sale + sumSales;
        }
        ;
        return sumSales;
    }

    public int sumAverageSales(int[] sales) {
        int sumSales = sumSales(sales);
        return (sumSales / sales.length);

    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return (minMonth + 1);

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return (maxMonth + 1);

    }

    public int AverageSalesMin(int[] sales) {
        int amountMonth = 0;
        int average = sumAverageSales(sales);
        for (int sale : sales) {
            if (sale < average) {
                amountMonth = amountMonth + 1;

            }

        }
        return (amountMonth);
    }

    public int AverageSalesMax(int[] sales) {
        int amountMonth = 0;

        int average = sumAverageSales(sales);
        for (int sale : sales) {
            if (sale > average) {
                amountMonth = amountMonth + 1;

            }

        }
        return (amountMonth);
    }


}
