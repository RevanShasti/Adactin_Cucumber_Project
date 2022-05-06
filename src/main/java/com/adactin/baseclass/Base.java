package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	

		public static WebDriver driver;
		public static Actions a;
		public static Select s;
		public static String value;

		public static WebDriver getBrowser(String type) {

			if (type.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\admin\\eclipse-workspace\\Adactin_Cucumber\\Chrome101\\chromedriver.exe");

				driver = new ChromeDriver();
			} else if (type.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\admin\\eclipse-workspace\\Adactin_Cucumber\\Fox\\geckodriver.exe");

				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			return driver;

		}

		public static void clickElement(WebElement button) {

			button.click();

		}

		public static void inputValue(WebElement element,String value) {

			element.sendKeys(value);

		}

		public static WebDriver close() {

			driver.close();
			return driver;
		}

		public static void quit() {

			driver.quit();
		}

		public static void getUrl(String url) {
			driver.get(url);

		}

		public static void dropDown(WebElement element, String type, String value) {
			s = new Select(element);
			if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("byIndex")) {
				int num = Integer.parseInt(value);
				s.selectByIndex(num);

			} else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}

		}

		public static void navigateTo(String type, String url) {
			driver.navigate().to(url);

		}

		public static void navigateBack() {
			driver.navigate().back();

		}

		public static void navigateForward() {
			driver.navigate().forward();

		}

		public static void refresh() {
			driver.navigate().refresh();

		}

		public static void simpleAlert() {

			driver.switchTo().alert().accept();

		}

		public static void confirmAlert(String type) {

			if (type.equalsIgnoreCase("ok")) {

				driver.switchTo().alert().accept();
			} else if (type.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}

		}

		public static void promptAlert(String type, String value) {

			if (type.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();
			} else if (type.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}

		}

		public static void printScreen(String name) throws Throwable {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin_Cucumber\\Screen_Shot//" + name + ".png");
			FileUtils.copyFile(source, destination);
		}

		public static void contextClickTarget(WebElement element) {
			a = new Actions(driver);
			a.contextClick(element).build().perform();
		}

		public static void contextClick() {
			a = new Actions(driver);
			a.contextClick().build().perform();
		}

		public static void doubleClick() {
			a = new Actions(driver);
			a.doubleClick().build().perform();
		}

		public static void doubleClickT(WebElement element) {
			a = new Actions(driver);
			a.doubleClick(element);
		}

		public static void moveToElement(WebElement element) {
			a = new Actions(driver);
			a.moveToElement(element).build().perform();

		}

		public static void dragAndDrop(WebElement source, WebElement target) {
			a = new Actions(driver);
			a.dragAndDrop(source, target).build().perform();

		}

		public static void clickAndHold(WebElement element) {
			a = new Actions(driver);
			a.clickAndHold(element).build().perform();
		}

		public static void release() {
			a = new Actions(driver);
			a.release().build().perform();

		}

		public static void implicitWait(long time) {

			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}

		public static void explicitWait(long sec, WebElement element) {

			WebDriverWait pause = new WebDriverWait(driver, sec);
			pause.until(ExpectedConditions.elementToBeClickable(element));

		}

		public static void windowHandles(String title) {

			Set<String> diffTabs = driver.getWindowHandles();
			for (String str : diffTabs) {

				System.out.println(driver.switchTo().window(str).getTitle());

			}

			String s = title;

			for (String particular : diffTabs) {

				if (driver.switchTo().window(particular).getTitle().equalsIgnoreCase(s)) {
					break;
				}
			}
		}

		public static void keyboard() throws AWTException {

			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}

		public static void checkMultiple(WebElement element) {
			s = new Select(element);
			boolean check = s.isMultiple();
			System.out.println(check);

		}

		public static void totalOptions(WebElement element) {
			s = new Select(element);
			List<WebElement> choices = s.getOptions();
			for (WebElement webElement : choices) {
				System.out.println("The Available choices :" + webElement.getText());
			}
		}

		public static void choosenOptions(WebElement element) {
			s = new Select(element);
			List<WebElement> myChoices = s.getAllSelectedOptions();
			for (WebElement webElement : myChoices) {
				System.out.println("The choices I choosed :" + webElement.getText());
			}

		}

		public static void firstOptOption(WebElement element) {
			s = new Select(element);
			WebElement optFirst = s.getFirstSelectedOption();
			System.out.println("The First Selected Option :" + optFirst.getText());

		}

		public static void title() {
			driver.getTitle();

		}

		public static void presentUrl() {
			driver.getCurrentUrl();

		}

		public static String attributeGet(WebElement element, String type, String identity) {
			if (type.equalsIgnoreCase("value")) {

				System.out.println(element.getAttribute("value"));

			} else {
				System.out.println(element.getAttribute(identity));

			}
			return identity;

		}

		public static void scrollUpAndDown(int a, int b) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + a + ", " + b + ")");

		}

		public static void frames(WebElement element, String type) {
			if (type.equalsIgnoreCase("frame")) {
				driver.switchTo().frame(element);
			} else if (type.equalsIgnoreCase("noframe")) {
				driver.switchTo().defaultContent();
			}

		}

		public static void isEnabled(WebElement element) {

			System.out.println(element.isEnabled());

		}

		public static void isDisplayed(WebElement element) {

			System.out.println(element.isDisplayed());
		}

		public static void isSelected(WebElement element) {

			System.out.println(element.isSelected());
		}

		public static void rButton(WebElement element) {

			element.click();
			System.out.println("Is Radio Button Selected:" + element.isSelected());
		}

		public static void cBox(WebElement element) {

			element.click();
			System.out.println("Is Checkbox Selected:" + element.isSelected());
		}

		public static String read_Excel(String path, String name, int row_Index, int cell_Index) throws IOException {

			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(name);
			Row r = sheet.getRow(row_Index);
			Cell c = r.getCell(cell_Index);
			CellType ct = c.getCellType();
			if (ct.equals(ct.STRING)) {

				value = c.getStringCellValue();
			} else if (ct.equals(ct.NUMERIC)) {
				double numericValue = c.getNumericCellValue();
				int data = (int) numericValue;
				value = String.valueOf(data);
			}
			return value;

		}

	}


