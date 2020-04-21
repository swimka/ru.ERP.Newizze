package ru.ERP;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHomepage extends ru.ERP.Newizze.WebDriverSettings {
    //проверка главной страницы
    @Test
    public void Homepage() throws InterruptedException {
        driver.get("http://erp-dev.newizze.com");
        driver.findElement(By.id("email")).sendKeys("executive@newizze.erp");
        driver.findElement(By.id("password")).sendKeys("q9seswAg24%xsc");
        driver.findElementByCssSelector(".btn.btn-primary").click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2500)");
        WebElement wait = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".el-select__input")));
        var vidget = driver.findElementByCssSelector(".el-select__input");
        vidget.click();
        WebElement wait2 = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]/span")));
        var pererab = driver.findElementByXPath("/html/body/div[2]/div[1]/div[1]/ul/li[1]/span");
        pererab.click();
        Thread.sleep(1000);
        System.out.println("Открыта вкладка переработки");
        Thread.sleep(2000);
        driver.findElementByName("date").click();
        Thread.sleep(1000);
        driver.findElementByCssSelector("td.available.today > div > span").click();
        Thread.sleep(1300);
        driver.findElementByName("hours").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//div[4]/div/div/div/div[3]").click();
        driver.findElementByName("comment").sendKeys("test");
        driver.findElementByCssSelector(".btn.btn.btn-primary.mt-2.btn-submit").click();
        System.out.println("Переработка добавлена");
        vidget.click();
        Thread.sleep(700);
        pererab.click();
        System.out.println("Виджет переработки закрыт");
        vidget.click();
        WebElement wait3 = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]/span")));
        var finanse = driver.findElementByXPath("/html/body/div[2]/div[1]/div[1]/ul/li[2]/span");
        finanse.click();
        Thread.sleep(1000);
        System.out.println("Открыт виджет доходы/расходы");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"addEntriesForm\"]/div[1]/div/div/div/div/div/span/span/i").click();
        Thread.sleep(1200);
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/ul/li[1]/span").click();
        System.out.println("Выбран текущий");
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"addEntriesForm\"]/div[2]/div/div/div/div/div/span/span/i").click();
        driver.findElementByXPath("/html/body/div[4]/div[1]/div[1]/ul/li[1]").click();
        System.out.println("Выбран доход");
        Thread.sleep(1000);
        driver.findElementByName("Name_entry").sendKeys("автотест доход" + n);
        driver.findElementByName("Amount").sendKeys("12" + n);
        driver.findElementByCssSelector(".btn.btn.btn-primary.mt-2.btn-submit").click();
        System.out.println("Доход добавлен");
        driver.quit();
    }

    @Test
    public void TestSotr() throws InterruptedException {
        // добавление сотрудника
        driver.get("http://erp-dev.newizze.com");
        driver.findElement(By.id("email")).sendKeys("executive@newizze.erp");
        driver.findElement(By.id("password")).sendKeys("q9seswAg24%xsc");
        driver.findElementByCssSelector(".btn.btn-primary").click();
        Thread.sleep(2000);
        driver.get("http://erp-dev.newizze.com/employees");
        Thread.sleep(1500);
        WebElement wait4 = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.linkText("Добавить Сотрудника")));
        var addsotr = driver.findElementByLinkText("Добавить Сотрудника");
        addsotr.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("scrollBy(0,250)");
        WebElement Dropstatus = driver.findElementByXPath("//*[@id=\"contactForm\"]/div/div[1]/div/div/div/div/div/input");
        Dropstatus.click();
        Thread.sleep(1200);
        WebElement DropList = driver.findElementByCssSelector(".el-scrollbar__view.el-select-dropdown__list");
        DropList.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[4]")).click();
        driver.findElementByName("lastname").sendKeys("Алькапонеautotestov" + n);
        driver.findElementByName("firstname").sendKeys("Мариоautotest" + n);
        driver.findElementByName("middlename").sendKeys("Иванович" + n);
        driver.findElementByName("phone").sendKeys("90811111" + n);
        driver.findElementByName("birthdate").click();
        Thread.sleep(1000);
        driver.findElementByXPath("/html/body/div[3]/div[1]/div/div[2]/table[1]/tbody/tr[3]/td[4]").click();
        System.out.println("Выбрана дата рождения");
        js.executeScript("document.querySelector(\".btn.btn.btn-primary.mt-2.btn-submit\").scrollIntoView()");
        String Email = "autotes" + n + "@gmail.com";
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElementByName("position").sendKeys("Autotester" + n);
        driver.findElementByName("wage").sendKeys("1" + n);
        driver.findElementByXPath("//*[@id=\"contactForm\"]/div/div[10]/div/div/div/div/div/input").click();
        Thread.sleep(600);
        driver.findElementByXPath("//div[4]/div/div/ul/li").click();
        driver.findElementByName("joined_at").click();
        Thread.sleep(1000);
        driver.findElementByXPath("/html/body/div[5]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[1]").click();
        driver.findElementByCssSelector(".btn.btn.btn-primary.mt-2.btn-submit").click();
        System.out.println("Создан пользователь с номером:" + n);
        driver.quit();


    }
    @Test
    public void Sotrerror() throws InterruptedException {
        // добавление сотрудника без заполнения обязательных полей
        driver.get("http://erp-dev.newizze.com");
        driver.findElement(By.id("email")).sendKeys("executive@newizze.erp");
        driver.findElement(By.id("password")).sendKeys("q9seswAg24%xsc");
        driver.findElementByCssSelector(".btn.btn-primary").click();
        Thread.sleep(2000);
        driver.get("http://erp-dev.newizze.com/employees");
        Thread.sleep(1500);
        WebElement wait4 = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.linkText("Добавить Сотрудника")));
        var addsotr = driver.findElementByLinkText("Добавить Сотрудника");
        addsotr.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\".btn.btn.btn-primary.mt-2.btn-submit\").scrollIntoView()");
        driver.findElementByCssSelector(".btn.btn.btn-primary.mt-2.btn-submit").click();
        System.out.println("Пользователь не создан, не заполнены обязательные поля:");


    }
    @Test
    public void SotrPremia() throws InterruptedException {
        driver.get("http://erp-dev.newizze.com");
        driver.findElement(By.id("email")).sendKeys("executive@newizze.erp");
        driver.findElement(By.id("password")).sendKeys("q9seswAg24%xsc");
        driver.findElementByCssSelector(".btn.btn-primary").click();
        Thread.sleep(2000);
        driver.get("http://erp-dev.newizze.com/employees");
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"app\"]/div[2]/main/div/div/div[1]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/div/div/a[1]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"contactForm\"]/div[1]/div/div/div/div/input").sendKeys("12"+n);
        WebElement Mounts = driver.findElementByXPath("//*[@id=\"contactForm\"]/div[2]/div/div/div/div/div/input");
        Mounts.click();
        Thread.sleep(1000);
        driver.findElementByXPath("/html/body/div[4]/div[1]/div[1]/ul/li[1]/span").click();
        WebElement Period = driver.findElementByXPath("//*[@id=\"contactForm\"]/div[3]/div/div/div/div/div[1]/input");
        Period.click();
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/ul/li[1]/span").click();
        driver.findElementByCssSelector(".btn.btn.btn-primary.mt-2.btn-submit").click();
        System.out.println("Премия добавлена");
    }
        @Test

        public void TestFinance() throws InterruptedException {
            driver.get("http://erp-dev.newizze.com");
            driver.findElement(By.id("email")).sendKeys("executive@newizze.erp");
            driver.findElement(By.id("password")).sendKeys("q9seswAg24%xsc");
            driver.findElementByCssSelector(".btn.btn-primary").click();
            Thread.sleep(2000);
            driver.get("http://erp-dev.newizze.com/finances");
            Thread.sleep(6000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
//            driver.findElementByXPath("//*[@id=\"pane-0\"]/div/div[1]/div[1]/div/div/div[3]/table/tbody/tr[4]/td[3]/div/button").click();
//            js.executeScript("document.querySelectorAll(\".btn.btn.btn-success.ml-1.btn-submit.btn-sm\")[0].click()");
            Thread.sleep(1000);
            driver.findElementByXPath("//*[@id=\"pane-0\"]/div/div[1]/div[1]/div/div/div[3]/table/tbody/tr[2]/td[1]/div/input").sendKeys("автотест доход" +n);
            driver.findElementByXPath("//*[@id=\"pane-0\"]/div/div[1]/div[1]/div/div/div[3]/table/tbody/tr[2]/td[2]/div/input").sendKeys("12"+n);
            driver.findElementByXPath("//*[@id=\"pane-0\"]/div/div[1]/div[1]/div/div/div[3]/table/tbody/tr[2]/td[2]/div/input").sendKeys(Keys.RETURN);






        }



    }
