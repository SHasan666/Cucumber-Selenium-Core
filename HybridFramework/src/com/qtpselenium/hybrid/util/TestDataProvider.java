package com.qtpselenium.hybrid.util;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class TestDataProvider {
// 1 data provider for 1 test suite
	
	@DataProvider(name="FAS_External_DataProvider")
	public static Object[][] getFASExternalSuiteData(Method m){
		System.out.println("================");
		
		String testName=m.getName();
		System.out.println(testName);
		Xls_Reader FAS_Ext_xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\xls\\FAS_External.xlsx");

		return TestUtil.getData(testName, FAS_Ext_xls);
	}

	@DataProvider(name="IIG_External_DataProvider")
	public static Object[][] getIIGExternalSuiteData(Method m){
		System.out.println("================");
		
		String testName=m.getName();
		System.out.println(testName);
		Xls_Reader IIG_Ext_xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\hybrid\\xls\\IIG_External.xlsx");

		return TestUtil.getData(testName, IIG_Ext_xls);
	}
}
