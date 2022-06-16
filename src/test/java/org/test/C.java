package org.test;

import org.testng.annotations.Test;

public class C {

	@Test
	private void test1() {
		System.out.println("123");
		System.out.println("456");
		System.out.println("789");


	}
	@Test(priority=0)
	private void test2() {
		System.out.println("0000");
		System.out.println("9999");
		System.out.println("8888");

	}
	@Test(enabled=true)
	private void test3() {
		System.out.println("7777");
		System.out.println("6666");
		System.out.println("5555");
	}
}
