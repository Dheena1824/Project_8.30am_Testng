package org.test;

import org.testng.annotations.Test;

public class A {

	@Test
	private void test1() {
		System.out.println("dheena");
		System.out.println("dinesh");
		System.out.println("divya");


	}
	@Test(priority=0)
	private void test2() {
		System.out.println("somu");
		System.out.println("aku");
		System.out.println("jo");

	}
	@Test(priority=1)
	private void test3() {
		System.out.println("mmmm");
		System.out.println("pppp");
		System.out.println("ssss");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	private void test5() {
		System.out.println("111111");
		System.out.println("222222");
		System.out.println("33333");

	}
}
