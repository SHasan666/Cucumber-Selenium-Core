package com.qtpselenium.hybrid.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.hybrid.util.Keywords;
import com.qtpselenium.hybrid.util.TestUtil;

public class FundNumberTest {
	
	
	/*@Test(dataProvider="getLoginFacebook")
	public void LoginTest(Hashtable<String,String> data){
		
		if(!TestUtil.isTestCaseExecutable("LoginFacebook", Keywords.xls))
		  throw new SkipException("Skipping the test as Runmode is NO");
		if(!data.get("RunMode").equals("Y"))
			  throw new SkipException("Skipping the test as data set Runmode is NO");

		System.out.println("***LoginFacebook***");
		Keywords k = Keywords.getKeywordsInstance();
		//k.executeKeywords("LoginFacebook",data);
		
	}
	*/

	/*@DataProvider
	public Object[][] getLoginFacebook(){
		return TestUtil.getData("LoginFacebook", Keywords.xls);
	}*/
	
	

}
