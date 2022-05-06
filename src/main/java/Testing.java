import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
    @Test
    void test_constructor() {
        Calculator c = new Calculator();
    }

    @Test
    void test_addition() {
        Calculator c = new Calculator();
        int thing = c.add(2, 2);
        Assert.assertEquals(4, thing);
    }

    @Test
    void test_subtration() {
        Calculator c = new Calculator();
        int thing = c.sub(2, 2);
        Assert.assertEquals(0, thing);
    }

    @Test
    void test_hexadecimal() {
        Calculator c = new Calculator();
        int dec = c.from_hex("0x45");

        Assert.assertEquals(69, dec);

    }


}