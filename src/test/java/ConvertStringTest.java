import org.example.ConvertString;
import org.junit.Assert;
import org.junit.Test;

public class ConvertStringTest {
    @Test
    public void test0() {
        String s = "ABCD";
        String actualOutput = new ConvertString().convert(s);
        String expectedOutput = "1230";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test1() {
        String s = "";
        String actualOutput = new ConvertString().convert(s);
        String expectedOutput = "";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        String s = "A";
        String actualOutput = new ConvertString().convert(s);
        String expectedOutput = "1";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        String s = "AB";
        String actualOutput = new ConvertString().convert(s);
        String expectedOutput = "12";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test4() {
        String s = "ADB";
        String actualOutput = new ConvertString().convert(s);
        String expectedOutput = "102";
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
