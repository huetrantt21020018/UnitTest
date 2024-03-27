import org.example.ElectricBill;
import org.junit.Assert;
import org.junit.Test;

public class ElectricBillTest {
    @Test
    public void test1() {
        int n = 30;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 54000;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        int n = 60;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 109000;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        int n = 120;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 229000;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test4() {
        int n = 240;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 513000;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test5() {
        int n = 360;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 855000;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test6() {
        int n = 450;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 1135000;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test7() {
        int n = 75;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 137500;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test8() {
        int n = 0;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 0;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test9() {
        int n = 1;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 1800;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test10() {
        int n = 499;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 1291800;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test11() {
        int n = 500;
        int actualOutput = new ElectricBill().calcElectricBill(n);
        int expectedOutput = 1295000;
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
