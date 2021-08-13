package ru.netology.stats;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void getSumSales() {
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.sumSales(arr);
        int expected = 180;

        assertEquals(expected, actual);
    }
    @Test
    public void getAverageSumSales() {
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.sumAverageSales(arr);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void getMinSales() {
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.minSales(arr);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void getMaxSales() {
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.maxSales(arr);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void getAmountMonthSalesLow() {
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.AverageSalesMin(arr);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void getAmountMonthSalesMax() {
        StatsService service = new StatsService();
        int[] arr = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.AverageSalesMax(arr);
        int expected = 5;

        assertEquals(expected, actual);
    }


}

