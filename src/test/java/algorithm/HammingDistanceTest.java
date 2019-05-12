package algorithm;


import org.junit.Assert;

public class HammingDistanceTest {
    @org.junit.Test
    public void calculate() {
        Assert.assertEquals(2, HammingDistance
                .calculate(1011101, 1001001));
        Assert.assertEquals(3, HammingDistance
                .calculate("karolin", "kathrin"));
        Assert.assertEquals(3, HammingDistance
                .calculate(2173896, 2233796));
        Assert.assertEquals(3, HammingDistance
                .calculate("karolin", "kerstin"));
        Assert.assertEquals(0, HammingDistance
                .calculate(10111011, 10111011));
        Assert.assertEquals(1, HammingDistance
                .calculate(1234567890, 1234567891));
    }
}
