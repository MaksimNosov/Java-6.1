
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void meanSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedSumSales = 15;
        double actualSumSales = service.meanSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 9;
        long actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMinSales);
    }

    @Test
    public void monthsBelowMeanSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelowMeanSales = 5;
        long actualMonthsBelowMeanSales = service.monthsBelowMeanSales(sales);

        Assertions.assertEquals(expectedMonthsBelowMeanSales, actualMonthsBelowMeanSales);
    }

    @Test
    public void monthsAboveMeanSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsAboveMeanSales = 5;
        long actualMonthsAboveMeanSales = service.monthsAboveMeanSales(sales);

        Assertions.assertEquals(expectedMonthsAboveMeanSales, actualMonthsAboveMeanSales);
    }

}
