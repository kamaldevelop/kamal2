package org.logout1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
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

public class Baseclass {

	WebDriver driver;

	public void getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	public void loadurl(String url) {
		driver.get(url);

	}

	public void type(WebElement element, String text) {
		element.sendKeys(text);

	}

	public WebElement findLocatorById(String AttributeValue) {
		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public WebElement findLocatorByName(String AttributeValue) {
		WebElement element = driver.findElement(By.name(AttributeValue));
		return element;
	}

	public WebElement findLocatorByClassName(String AttributeValue) {
		WebElement element = driver.findElement(By.className(AttributeValue));
		return element;
	}

	public WebElement findLocatorByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String getTitle() {
		String data = driver.getTitle();
		return data;
	}

	public String getUrl() {
		String data = driver.getCurrentUrl();
		return data;
	}

	public String getText(WebElement element) {
		String data = element.getText();
		return data;

	}
	
	
		
	

	

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttributeValueName(WebElement element, String attributeName) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public void selectByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public void selectByAttribute(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);
	}

	public void selectByAttributeValue(WebElement element, String attributeValue) {
		new Select(element).selectByValue(attributeValue);
	}

	public void typeJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("aruguments[0].setAttribute('value'," + text + "')", element);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void moveToElement(WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}

	public void doubleClick(WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	public void contextClick(WebElement element) {
		new Actions(driver).contextClick(element).perform();
	}

	public void dragAndDrop(WebElement element) {
		new Actions(driver).dragAndDrop(element, element).perform();
	}

	public void alertAccept(Alert a) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void alertDismiss(Alert a) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void alertGetText(Alert a) {
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}

	public void maximise() {
		driver.manage().window().maximize();
	}

	public void minimize() {
		driver.manage().window().minimize();
	}

	public void fileUtiles() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		fileUtiles();
	}

	public void getOptions(WebElement element, String text) {
		new Select(element).getOptions();
	}

	public void getAllSelectedOptions(WebElement element, String text) {
		new Select(element).getAllSelectedOptions();
	}

	public void getFirstSelectedOptions(WebElement element, String text) {
		new Select(element).getFirstSelectedOption();
	}

	public void isMultiple(WebElement element, String text) {
		new Select(element).isMultiple();
	}

	public void deselectByIndex(WebElement element, int index) {
		new Select(element).deselectByIndex(index);
	}

	public void deselectByAttribute(WebElement element, String text) {
		new Select(element).deselectByVisibleText(text);
	}

	public void deselectByAttributeValue(WebElement element, String attributeValue) {
		new Select(element).deselectByValue(attributeValue);
	}

	public void deselectAll(WebElement element, String text) {
		new Select(element).deselectAll();
	}

	public void size(WebElement element) {
		element.getSize();
	}

	public void frame(int index) {
		driver.switchTo().frame(index);
	}

	public void frame(String text) {
		driver.switchTo().frame(text);
	}

	public void frame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void defaultContent() {
		driver.switchTo().parentFrame();

	}

	public void getScreenshot(String path) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		File d = new File(path);
		FileUtils.copyFile(s, d);
	}

	public void clickJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("aruguments[0].click", element);
	}

	public void scrollDownJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("aruguments[0].scrollIntoView(true)", element);
	}

	public void scrollUpJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("aruguments[0].scrollIntoView(false)", element);
	}

	public void keyDown(String key) {
		new Actions(driver).keyDown("attributeName").perform();
	}

	public void keyUp(String key) {
		new Actions(driver).keyUp("attributeName").perform();
	}

	public void sendkeys(String keys) {
		new Actions(driver).sendKeys("attributeValue").perform();
	}

	public String getWindowHandle() {
		String handle = driver.getWindowHandle();
		return handle;
	}

	public String getWindowHandles() {
		Set<String> handles = driver.getWindowHandles();
		return null;

	}

	public void gettypeJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("return aruguments[0].getAttribute('value',attributeValue", element);
	}

	public void isMultipleBoolean(WebElement element, String text) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
	}

	public void getUrl(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("Window.location='url'");
	}

	public void threadSleep() throws InterruptedException {
		Thread.sleep(0);
	}

	public void fileInputStream(String path) throws FileNotFoundException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
	}

	public void workBook(String path) {
		File file = new File(path);
		Workbook workbook = new XSSFWorkbook();
	}

	public void createSheet(String path) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
	}

	public void createRow(String path) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		Row row = sheet.createRow(0);
	}

	public void createCell(String path) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
	}

	public void rowsCount(String path) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		sheet.getPhysicalNumberOfRows();
	}

	public void cellCount(String path) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		Row row = sheet.createRow(0);
		row.getPhysicalNumberOfCells();
	}

	public void implicityWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}

	public void fluent() { // 62
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(0))
				.pollingEvery(Duration.ofSeconds(0)).ignoring(NoSuchElementException.class);
	}

	public String getdata(String SheetName, int rownum, int cellnum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\91936\\Pictures\\Camera\\Maven1\\Excel\\Book3.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
				res = dateformat.format(dateformat);
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal num = BigDecimal.valueOf(d);
				res = num.toString();
			}
		default:
			break;
		}
		return res;

	}

	public void thread(long millis) throws InterruptedException {
	Thread.sleep(millis);

	}
	public void writeData(String sheetname, int rownum, int cellnum, String value) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\91936\\Pictures\\Camera\\Maven1\\Excel\\Book3.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(value);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}	
}