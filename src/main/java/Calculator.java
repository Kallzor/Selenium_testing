import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {
    public int add(int one, int two) {
        return one + two;
    }

    public int sub(int one, int two) {
        return one - two;
    }

    public int from_hex(String first) {
        WebDriver d = new FirefoxDriver();
        d.get("https://www.rapidtables.com/convert/number/hex-to-decimal.html");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement button = d.findElement(new By.ByClassName("fc-button-label"));
        button.click();

        WebElement input_field = d.findElement(new By.ByClassName("input-group"));
        input_field.click();

        WebElement other_thing =input_field.findElement(By.name("x"));
        other_thing.click();
        other_thing.sendKeys(first);

        WebElement btn = d.findElement(By.className("btn"));
        btn.click();

        WebElement r = d.findElement(By.xpath("//*[@id=\"y\"]"));
        int thing = Integer.parseInt(r.getAttribute("value"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        d.close();
        return thing;
    }
}