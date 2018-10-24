package com.selenium.pages;

import com.selenium.pages.stepDefs.BaseStepDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("cucumber-glue")

public class loginApplicationAndSearch extends BaseStepDef {

    @FindBy(id="btn-make-appointment")
    public static WebElement MAKEAPPTBUTTON;

    @FindBy(id="txt-username")
    public static WebElement USERNAMEFLD;

    @FindBy(id="txt-password")
    public static WebElement PASSWORDFLD;

    @FindBy(id="btn-login")
    public static WebElement LOGINBTN;




        public static void openGoogle(){
            System.setProperty("webdriver.chrome.driver","/home/mahesh/Downloads/chromedriver");
            driver =new ChromeDriver();
            driver.get("https://www.google.com/");

        }

        public static void searchInGoogle(String SEARCHELEMENT){
            driver.findElement(By.id("lst-ib")).sendKeys(SEARCHELEMENT);
            driver.findElement(By.xpath("//input[@value='Google Search']"));
        }

        public static void clickFirstLink(){
            System.out.println("it passed");
           driver.quit();
        }



        public static void loginApplicationPratice(String username,String password){
            System.setProperty("webdriver.chrome.driver","/home/mahesh/Downloads/chromedriver");
            driver=new ChromeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            MAKEAPPTBUTTON.click();
            USERNAMEFLD.sendKeys(username);
            PASSWORDFLD.sendKeys(password);
            LOGINBTN.click();
        }

        public static void addDetailsAppointmentPractice(){
            System.out.println("hi");
            WebElement mySelectElement=driver.findElement(By.name("facility"));
            Select dropdown= new Select(mySelectElement);
            dropdown.selectByValue("HongKong CURA Healthcare Center");
            WebElement button1=driver.findElement(By.id("chk_hospotal_readmission"));
            button1.click();
            WebElement button2=driver.findElement(By.id("radio_program_medicaid"));
            button2.click();
            driver.findElement(By.id("txt_visit_date")).sendKeys("12/11/2018");
            driver.findElement(By.id("txt_comment")).sendKeys("Need to be registered");
            driver.findElement(By.id("btn-book-appointment")).click();

        }

    }
