package com.myfirstmavenproject.junit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorTest {
	Calculator cal=new Calculator();

  @Test(dataProvider="dpAdd")
  public void add1(int expValue,int a,int b) {
	  Assert.assertEquals(expValue,  cal.add1(5,5));  
  }
  @Test(groups="smoke")
  public void sub1() {
   
  }


@DataProvider(name="dpAdd")
public Object[][] getdata(){
	Object[][] t1=new Object[][] {
		{10,5,5},
		{20,10,10},
		{15,7,8},
		{16,6,6},
		{19,6,6},
		{29,7,5},
		{11,6,8}
	};
	return t1;
	}
	
}
