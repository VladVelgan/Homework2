package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class Homework2 {

    @Test
    public void testCase1() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        String actualTitle = driver.getTitle().trim();
        String expectedTitle = "Web Orders Login";
        Assert.assertEquals(actualTitle, expectedTitle);
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Web Orders";
        Assert.assertEquals(actualTitle2, expectedTitle2);
        System.out.println(actualTitle2.equals(expectedTitle2) ? "Title equals to \"Web Orders\" --> TRUE" :
                "Title equals to \"Web Orders\" --> FALSE");
        WebElement header = driver.findElement(By.tagName("h2"));
        String actualHeader = header.getText().trim();
        String expectedHeader = "List of All Orders";
        Assert.assertEquals(actualHeader, expectedHeader);
        System.out.println(actualHeader.equals(expectedHeader) ? "Header equals to \"List of All Orders\" --> TRUE" :
                "Header equals to \"List of All Orders\" --> FALSE");
        driver.quit();
    }

    @Test
    public void testCase2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
        WebElement viewAllProducts = driver.findElement(By.linkText("View all products"));
        viewAllProducts.click();
        viewAllProducts = driver.findElement(By.linkText("View all products"));
        Thread.sleep(1000);
        System.out.println(viewAllProducts.isEnabled() ? "\"View all products\" is selected --> TRUE" : "\"View all products\" is selected --> FALSE");
        WebElement header = driver.findElement(By.tagName("h2"));
        String actualHeader = header.getText().trim();
        String expectedHeader = "List of Products";
        Assert.assertEquals(actualHeader, expectedHeader);
        System.out.println(actualHeader.equals(expectedHeader) ? "Header equals to \"List of Products\" --> TRUE" :
                "Header equals to \"List of Products\" --> FALSE");
        String actualUrl = driver.getCurrentUrl();
        String expectedKeyword = "Products";
        System.out.println(actualUrl.contains(expectedKeyword) ? "Url has \"Products\" keyword --> TRUE" : "Url has \"Products\" keyword --> FALSE");
        driver.quit();
    }

    @Test
    public void testCase3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
        WebElement viewAllOrders = driver.findElement(By.linkText("View all orders"));
        String actualLink = viewAllOrders.getAttribute("href").trim();
        String expectedLink = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
        System.out.println(actualLink.equals(expectedLink)?"\"View all orders\" href values are equal --> TRUE":
                "\"View all orders\" href values are equal --> FALSE");
        WebElement viewAllProducts = driver.findElement(By.linkText("View all products"));
        String actualLink2 = viewAllProducts.getAttribute("href").trim();
        String expectedLink2 = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx";
        System.out.println(actualLink2.equals(expectedLink2)?"\"View all products\" href values are equal --> TRUE":
                "\"View all products\" href values are equal --> FALSE");
        WebElement order = driver.findElement(By.linkText("Order"));
        String actualLink3 = order.getAttribute("href").trim();
        String expectedLink3 = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx";
        System.out.println(actualLink3.equals(expectedLink3)?"\"Order\" href values are equal --> TRUE":
                "\"Order\" href values are equal --> FALSE");
        driver.quit();
    }

    @Test
    public void testCase4() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
        WebElement order = driver.findElement(By.linkText("Order"));
        order.click();
        WebElement productBox = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_ddlProduct"));
        Select options = new Select(productBox);
        options.selectByValue("ScreenSaver");
        WebElement quantity = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.clear();
        quantity.sendKeys("5");
        WebElement customer = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
        customer.sendKeys("CodeFish IT School");
        WebElement street = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
        street.sendKeys("2200 E devon");
        WebElement city = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
        city.sendKeys("Des Plaines");
        WebElement state = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4"));
        state.sendKeys("Illinois");
        WebElement zip = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"));
        zip.sendKeys("60018");
        WebElement card = driver.findElement(By.xpath("//input[@value='MasterCard']"));
        card.click();
        WebElement cardNumber = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6"));
        cardNumber.sendKeys("444993876233");
        WebElement expireDate = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
        expireDate.sendKeys("03/24");
        WebElement processButton = driver.findElement(By.cssSelector(".btn_light"));
        processButton.click();
        WebElement message = driver.findElement(By.xpath("//strong[contains(text(),'New order')]"));
        System.out.println(message.isDisplayed()?"\"New order has been successfully added.\" is displayed --> TRUE" :
                "\"New order has been successfully added.\" is displayed --> FALSE");
        WebElement viewAllOrders = driver.findElement(By.linkText("View all orders"));
        viewAllOrders.click();
        List<WebElement> orderList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr[2]//td"));
        Thread.sleep(1000);
        List<String> expectedInputs = Arrays.asList("ScreenSaver", "5", "CodeFish IT School", "2200 E devon", "Des Plaines",
                "Illinois", "60018", "444993876233", "03/24", "06/01/2023", "MasterCard");
        boolean inputMatch = false;
        for(int i = 1; i < orderList.size()-1; i++){
            for(String input : expectedInputs){
                if(orderList.get(i).getText().trim().equals(input)){
                    inputMatch = true;
                    break;
                }else inputMatch = false;
            }
            if(inputMatch == false) break;
        }
        WebElement newOrder = driver.findElement(By.xpath("//td[.='CodeFish IT School']"));
        System.out.println(newOrder.isDisplayed() ? "New order is added --> TRUE" : "New order is added --> FALSE");
        System.out.println(inputMatch ? "All inputs are matching --> TRUE" : "All inputs are matching --> FALSE");
        driver.quit();

    }
}
