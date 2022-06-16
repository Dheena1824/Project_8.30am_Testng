package org.test;

import org.testng.annotations.Test;

public class B {

	@Test(invocationCount=0)
	private void test1() {
		System.out.println("dddd");
		System.out.println("eeee");
		System.out.println("nnnnn");


	}
	@Test
	private void test2() {
		System.out.println("aaaaa");
		System.out.println("mmmm");
		System.out.println("yyyy");

	}
	@Test
	private void test3() {
		System.out.println("tttt");
		System.out.println("hhhhh");
		System.out.println("iiiii");

	}
}
