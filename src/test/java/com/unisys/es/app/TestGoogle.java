package com.unisys.es.app;


import java.util.regex.Pattern;
        import java.util.concurrent.TimeUnit;
        import org.junit.*;
        import static org.junit.Assert.*;
        import static org.hamcrest.CoreMatchers.*;
        import org.openqa.selenium.*;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.Select;

public class TestGoogle {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.es/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testBusquedaGoogleSelenuim() throws Exception {
        driver.get(baseUrl + "/?gfe_rd=cr&ei=gO5-VbG1BKvP0wWFv4GoCw&gws_rd=ssl");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("unisys");
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if ("Unisys España - Una empresa internacional de tecnologías ...".equals(driver.findElement(By.linkText("Unisys España - Una empresa internacional de tecnologías ...")).getText())) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        try {
            assertEquals("Unisys España - Una empresa internacional de tecnologías ...", driver.findElement(By.linkText("Unisys España - Una empresa internacional de tecnologías ...")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Unisys España - Una empresa internacional de tecnologías ...")).click();
        try {
            assertEquals("Socios", driver.findElement(By.xpath("//ul[@id='zz2_RootAspMenu']/li[5]/a/span/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//ul[@id='zz2_RootAspMenu']/li[5]/a/span/span")).click();
        try {
            assertEquals("Hay veces que no se puede hacer en solitario", driver.findElement(By.cssSelector("h2")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}