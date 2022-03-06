package org.logout1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinhotel {
	public static void main(String[] args) throws IOException, InterruptedException {

		Baseclass baseClass = new Baseclass();

		baseClass.getDriver();

		baseClass.loadurl("https://adactinhotelapp.com/");

		baseClass.maximise();

		WebElement txtUser = baseClass.findLocatorById("username");
		String name = baseClass.getdata("Sheet1", 1, 0);
		baseClass.type(txtUser, name);

		WebElement txtpass = baseClass.findLocatorById("password");
		String pass = baseClass.getdata("Sheet1", 1, 1);
		baseClass.type(txtpass, pass);

		WebElement btnlogin = baseClass.findLocatorById("login");
		baseClass.click(btnlogin);
		
		WebElement dDnlocation = baseClass.findLocatorById("location");
		baseClass.click(dDnlocation);
		baseClass.selectByIndex(dDnlocation, 1);

		
		WebElement dDnhotel = baseClass.findLocatorById("hotels");
		baseClass.click(dDnhotel);
		baseClass.selectByIndex(dDnhotel, 1);

		WebElement dDnroom = baseClass.findLocatorById("room_type");
		baseClass.click(dDnroom);
		baseClass.selectByIndex(dDnroom, 1);

		WebElement dDnsubmit = baseClass.findLocatorById("Submit");
		baseClass.click(dDnsubmit);

		WebElement dDnSelec = baseClass.findLocatorByXpath("//input[@type='radio']");
		baseClass.click(dDnSelec);

		WebElement dDnContinue = baseClass.findLocatorById("continue");
		baseClass.click(dDnContinue);

		WebElement txtFirst = baseClass.findLocatorById("first_name");
		String fname = baseClass.getdata("Sheet1", 1, 2);
		baseClass.type(txtFirst, fname);

		WebElement txtLast = baseClass.findLocatorById("last_name");
		String lname = baseClass.getdata("Sheet1", 1, 3);
		baseClass.type(txtLast, lname);

		WebElement txtAddress = baseClass.findLocatorById("address");
		String address = baseClass.getdata("Sheet1", 1, 4);
		baseClass.type(txtAddress, address);

		WebElement txtcard = baseClass.findLocatorById("cc_num");
		String card = baseClass.getdata("Sheet1", 1, 5);
		baseClass.type(txtcard, card);

		WebElement Ddncc = baseClass.findLocatorById("cc_type");
		baseClass.click(Ddncc);
		baseClass.selectByIndex(Ddncc, 1);

		WebElement Ddnmonth = baseClass.findLocatorById("cc_exp_month");
		baseClass.click(Ddnmonth);
		baseClass.selectByIndex(Ddnmonth, 3);

		WebElement Ddnyear = baseClass.findLocatorById("cc_exp_year");
		baseClass.click(Ddnyear);
		baseClass.selectByIndex(Ddnyear, 12);

		WebElement txtcvv = baseClass.findLocatorById("cc_cvv");
		String cvv = baseClass.getdata("Sheet1", 1, 6);
		baseClass.type(txtcvv, cvv);

		WebElement Ddnbook = baseClass.findLocatorById("book_now");
		baseClass.click(Ddnbook);

		baseClass.implicityWait(300);

		WebElement dDnorder = baseClass.findLocatorById("order_no");
		String attribute = baseClass.getAttribute(dDnorder);
		baseClass.writeData("Sheet1", 1, 7, attribute);

	}
}