package com.lti.mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.demo.Welcome;

public class TestWelcome {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Welcome w = new Welcome();
		assertEquals("Hi", w.hello());
	}

}
