package com.qtpselenium.hybrid.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;



public class Keywords {
	
	//public static Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\xls\\Test Suite1.xlsx");
	//public static Xls_Reader FAS_Ext_xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\xls\\FAS_External.xlsx");
	//public static Xls_Reader IIG_Ext_xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\xls\\IIG_External.xlsx");

	static Keywords keywords=null;
	public Properties CONFIG=null;
	public Properties OR=null;
	public WebDriver driver =null;
	WebDriver mozilla=null;
	WebDriver chrome=null;
	WebDriver ie=null;
	
	
	private Keywords(){
		System.out.println("Initializing Keywords");
		// initialize properties files
		try {
			// config
			CONFIG = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\config\\config.properties");
			CONFIG.load(fs);
			// OR
			OR = new Properties();
			fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\config\\OR.properties");
			OR.load(fs);

		} catch (Exception e) {
			// Error is found
			e.printStackTrace();
		}
	}
	
	
	public List<String> executeKeywords(String testName,Hashtable<String,String> data , Xls_Reader xls , List<String> result){
		List<String> result2 = new ArrayList<String>();
		
		System.out.println("Executing - "+testName);
		// find the keywords for the test
		String keyword=null;
		String objectKey=null;
		String dataColVal=null;
		for(int rNum=2;rNum<=xls.getRowCount("Test Steps");rNum++){
			if(testName.equals(xls.getCellData("Test Steps", "TCID", rNum))){
			 keyword=xls.getCellData("Test Steps", "Keyword", rNum);
			 objectKey=xls.getCellData("Test Steps", "Object", rNum);
			 dataColVal=xls.getCellData("Test Steps", "Data", rNum);
			
			// System.out.println(keyword +" -- "+objectKey+" -- "+ dataColName);
			 if(keyword.equals("openBrowser"))
				 openBrowser(data.get(dataColVal));
			 //else if (keyword.equals("click"))
				 //result=click(objectKey);
			 else if(keyword.equals("input"))
				 input(objectKey,data.get(dataColVal) , result);
			 else if(keyword.equals("navigate"))
				 navigate(xls , dataColVal);
			 //else if(keyword.equals("verifyText"))
				 //result=verifyText();
			 //else if(keyword.equals("checkMail"))
				 //result= checkMail(data.get(dataColVal));
			 //else if(keyword.equals("verifyLogin"))
				 //result=verifyLogin(data.get(dataColVal));
			 else if(keyword.equals("hitEnter"))
				 hitEnter(objectKey);
			 //else if(keyword.equals("verifyFundNumber"))
				 //result=verifyFundNumber(data.get(dataColVal));
			 else if(keyword.equals("verifyOverViewPage"))
				 result2=verifyOverViewPage(data , dataColVal , result);
			 
			 
			 /*System.out.println(result);
			 
			 
			 if(!result.equals("Pass")){
				 
				 // screenshot
				 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 String fileName=testName+"_"+keyword+".jpg";
				    try {
						FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//screenshots//"+fileName));
					} catch (IOException e) {
						System.out.println("***ERR***");
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					 Assert.assertTrue(false, result);


			 }*/
			 //
			 //
			}
		}
		
		if(result2!= null && result2.size()>0)
		 {
			 return result2;
		 }else
		 {
			 return null;
		 }
	}
	
	
	
	public void openBrowser(String browserType){
		System.out.println("Executing openBrowser");
		
		try{
			
			if(browserType.equals("Mozilla") && mozilla==null){
				driver = new FirefoxDriver();
				mozilla=driver;
			}else if(browserType.equals("Mozilla") && mozilla!=null){
				driver=mozilla;
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		/*if(CONFIG.getProperty(browserType).equals("Mozilla"))
			driver= new FirefoxDriver();
		else if(CONFIG.getProperty(browserType).equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "Path to chromedriver exe");
			driver= new ChromeDriver();
		}
		else if ((CONFIG.getProperty(browserType).equals("IE")))
			driver= new InternetExplorerDriver();*/
		if(driver==null)
		{
			Assert.assertTrue(false, "Unable to open browser");
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void navigate(Xls_Reader xls , String environment){
		String URLKey = xls.getCellData("Config", environment.trim().toUpperCase(), 2);;
	
		System.out.println("Executing navigate to -> "+environment+" -> "+URLKey);
		try{
		driver.get(URLKey);
		}catch(Exception e){
			Assert.assertTrue(false, "Not able to navigate");
			
		}
		
	}
	
	public void closeBrowser()
	{
		
			driver.close();
		
	}
	public String click(String xpathKey){
		System.out.println("Executing click");
		try{
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
		}catch(Exception e){
			return "Fail - not able to click - "+xpathKey;

		}
		return "Pass";	
	}
	
	public void hitEnter(String xpathKey){
		System.out.println("Executing hitEnter");
		try{
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).sendKeys(Keys.ENTER);;
		}catch(Exception e){
			Assert.assertTrue(false, "Not able to hitEnter - "+xpathKey);
			

		}
		
	}
	
	public void input(String xpathKey,String data , List<String> result){
		System.out.println("Executing input");
		try{
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).sendKeys(data);
		}catch(Exception e){
			Assert.assertTrue(false, "Fail - not able to enter data in input box -"+xpathKey);

		}
					
	}
	
	public String verifyText(){
		System.out.println("Executing verifyText");

		return "Pass";					
	}
	
	/**************************Application dependent****************************/
	public String checkMail(String mailName){
		System.out.println("Executing checkMail");

		try{
		driver.findElement(By.linkText(mailName)).click();
		}catch(Exception e){
			return "Fail-Mail not found";
		}
		
		
		
		return "Pass";							
	}
	
	
	
	//******Singleton function*******//
	public static Keywords getKeywordsInstance(){
		if(keywords == null){
			keywords = new Keywords();
		}
		
		
		return keywords;
	}
	
	public String verifyLogin(String verificationText){
		
		int total= driver.findElements(By.xpath(OR.getProperty("login_err_msg"))).size();
		int inboxcount=driver.findElements(By.xpath(OR.getProperty("inbox"))).size();
		if(total!=0){
			// not logged in
			// verify err msg
			if(driver.findElement(By.xpath(OR.getProperty("login_err_msg"))).equals(verificationText))
				return "Pass";
			else 
				return "Fail - Not able to find the error message ";
		}
			
		else if(inboxcount!=0){
		 // logged in
			if(driver.findElement(By.xpath(OR.getProperty("inbox"))).equals(verificationText))
				return "Pass";
			else 
				return "Fail - Not able to find the Inbox link";
		}
		
		return "Fail";
	}
	
public String verifyFundNumber(String verificationText){
		
		int total= driver.findElements(By.xpath("//*[@id='loginbutton']")).size();
		
		if(total==0){
		
				return "Fail - Not able to find the error message ";
		}
	
		
		return "Pass";
	}
	
 public List<String> verifyOverViewPage(Hashtable<String,String> data , String validations , List<String> result)
 {
	
		System.out.println("Validations -> "+validations.trim());
		String[] allValidations = validations.trim().split(",");
		
		for(int i=0; i<allValidations.length;i++)
		{
			System.out.println("==== "+allValidations[i].trim()+" =====");
			if(allValidations[i].trim().equalsIgnoreCase("FundName"))
			{
				String verifyFundNameResult = verifyFundName(data.get("FundName"));
				if(verifyFundNameResult!=null)
				{
					result.add(verifyFundNameResult);
				}
				
			}else if(allValidations[i].trim().equalsIgnoreCase("Ticker"))
			{
				String verifyTickerResult = verifyTicker(data.get("Ticker"));
				if(verifyTickerResult!=null)
				{
					result.add(verifyTickerResult);
				}
				
				
				
			}else if(allValidations[i].trim().equalsIgnoreCase("CUSIP"))
			{
				String verifyCUSIPResult = verifyCUSIP(data.get("CUSIP"));
				if(verifyCUSIPResult!=null)
				{
					result.add(verifyCUSIPResult);
				}
				
				
			}
		}
		
		return result;
			
	
 }
	
 public String verifyFundName(String expected){
		System.out.println("Verifying -> FundName");
		expected = expected.trim();
		String actual=driver.findElement(By.xpath("//button[@id='loginbutton']")).getText().trim();
		
		if(!expected.equalsIgnoreCase(actual))
		{
			return "FundName not matched. expected -> "+expected+" but actual -> "+actual;
		}
		
		return null;
	}
	
	public String verifyTicker(String expected){
		System.out.println("Verifying -> Ticker");
		expected = expected.trim();
		String actual=driver.findElement(By.xpath("(//div[@id='loginform']/div/a)[1]")).getText().trim();
		if(!expected.equalsIgnoreCase(actual))
		{
			return "Ticker not matched. expected -> "+expected+" but actual -> "+actual;
		}
		
		return null;
				
	}
	
	public String verifyCUSIP(String expected){
		System.out.println("Verifying -> CUSIP");
		expected = expected.trim();
		String actual=driver.findElement(By.xpath("//a[@id='reg-link']")).getText().trim();
		if(!expected.equalsIgnoreCase(actual))
		{
			return "CUSIP not matched. expected -> "+expected+" but actual -> "+actual;
		}
		
		return null;
				
	}
	

}
