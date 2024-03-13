import org.example.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void test1() {
        int a = 1, b = 2, c = 5;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Không phải tam giác";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        int a = 2, b = 2, c = 2;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác đều";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        int a = 2, b = 2, c = 3;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác cân";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test4() {
        int a = 3, b = 4, c = 5;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác vuông";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test5() {
        int a = 4, b = 5, c = 6;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác thường";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test6() {
        int a = 10, b = 10, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác đều";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test7() {
        int a = 10, b = 10, c = 1;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác cân";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test8() {
        int a = 10, b = 10, c = 2;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác cân";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test9() {
        int a = 10, b = 10, c = 2147483646;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Không phải tam giác";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test10() {
        int a = 10, b = 10, c = 2147483647;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Không phải tam giác";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test11() {
        int a = 10, b = 1, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác cân";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test12() {
        int a = 10, b = 2, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác cân";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test13() {
        int a = 10, b = 2147483646, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Không phải tam giác";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test14() {
        int a = 10, b = 2147483647, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Không phải tam giác";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test15() {
        int a = 1, b = 10, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác cân";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test16() {
        int a = 2, b = 10, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Tam giác cân";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test17() {
        int a = 2147483646, b = 10, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Không phải tam giác";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test18() {
        int a = 2147483647, b = 10, c = 10;
        String actualOutput = new Triangle().triangleType(a, b, c);
        String expectedOutput = "Không phải tam giác";
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
