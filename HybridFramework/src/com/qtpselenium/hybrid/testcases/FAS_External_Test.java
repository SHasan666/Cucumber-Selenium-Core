package com.qtpselenium.hybrid.testcases;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;








import com.qtpselenium.hybrid.util.Keywords;
import com.qtpselenium.hybrid.util.TestDataProvider;
import com.qtpselenium.hybrid.util.TestUtil;
import com.qtpselenium.hybrid.util.Xls_Reader;



public class FAS_External_Test {
	Xls_Reader FAS_Ext_xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\xls\\FAS_External.xlsx");
	Keywords k = Keywords.getKeywordsInstance();
	@AfterTest
	public void close()
	{
		System.out.println("(((((((((((((((((((((((((((((((((((( Running After Class FAS_External_Test)))))))))))))))))))))");
		//k.closeBrowser();
		k.driver.close();
	
	}
	@Test(priority =1 , dataProviderClass=TestDataProvider.class,dataProvider="FAS_External_DataProvider")
	public void Overview(Hashtable<String,String> data, Method method){
		List<String> result = new ArrayList<String>();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ result now for overview-> "+result.toString());
		
		String testName=method.getName().trim();
		
		if(!TestUtil.isTestCaseExecutable(testName, FAS_Ext_xls))
			  throw new SkipException("Skipping the test as Runmode is NO");
			if(!data.get("RunMode").equals("Y"))
				  throw new SkipException("Skipping the test as data set Runmode is NO");

			System.out.println("***"+testName+"***");
			//Keywords k = Keywords.getKeywordsInstance();
			result = k.executeKeywords(testName,data,FAS_Ext_xls , result);
		
			if(result!=null)
			{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@ overview finish result now -> "+result.toString());

				String defects = "";
				for(int i=0;i<result.size();i++)
				{
					defects +=result.get(i).trim()+"\n"; 
				}
				Assert.assertTrue(false, defects);
			}
	}
	

	@Test(priority =2 , dataProviderClass=TestDataProvider.class,dataProvider="FAS_External_DataProvider")
	public void Portfolio(Hashtable<String,String> data , Method method){
		List<String> result = new ArrayList<String>();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ result now for portfolio-> "+result.toString());
		
		String testName=method.getName().trim();
		
		if(!TestUtil.isTestCaseExecutable(testName, FAS_Ext_xls))
		  throw new SkipException("Skipping the test as Runmode is NO");
		if(!data.get("RunMode").equals("Y"))
			  throw new SkipException("Skipping the test as data set Runmode is NO");

		System.out.println("***"+testName+"***");
		//Keywords k = Keywords.getKeywordsInstance();
		result = k.executeKeywords(testName,data,FAS_Ext_xls , result);
		
		if(result!=null)
		{
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@ portfolio finish result now -> "+result.toString());

			String defects = "";
			for(int i=0;i<result.size();i++)
			{
				defects +=result.get(i).trim()+"\n"; 
			}
			Assert.assertTrue(false, defects);
		}
	}
	
	/*
	@DataProvider
	public Object[][] getOverview(){
		return TestUtil.getData("Overview", Keywords.FAS_Ext_xls);
	}
*/
}
