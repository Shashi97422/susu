package com.test;

import org.testng.annotations.Test;

import com.dash.generic.BaseClass;

public class Launch extends BaseClass {
@Test
public void test() {
	
	driver.get("https://www.amazon.in/");

}
}
