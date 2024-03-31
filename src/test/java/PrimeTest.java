import org.example.Prime;
import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {
    @Test
    public void test1() {
        int n = 1;
        boolean actualOutput = new Prime().isPrime(n);
        boolean expectedOutput = false;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        int n = 3;
        boolean actualOutput = new Prime().isPrime(n);
        boolean expectedOutput = true;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        int n = 4;
        boolean actualOutput = new Prime().isPrime(n);
        boolean expectedOutput = false;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test4() {
        int n = 5;
        boolean actualOutput = new Prime().isPrime(n);
        boolean expectedOutput = true;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test5() {
        int n = 9;
        boolean actualOutput = new Prime().isPrime(n);
        boolean expectedOutput = false;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test6() {
        int n = 13;
        boolean actualOutput = new Prime().isPrime(n);
        boolean expectedOutput = true;
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}