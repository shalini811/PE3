package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pe3Test {

	private static Pe3 x;
	@BeforeClass
	public static void setup() {
	 x = new Pe3();
	}
	
	@AfterClass
	public static void teardown() {
		x = null;
	}
	
	String[][] s = {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
			{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
			{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
			{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
	String[][] s1 = {{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
			{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
			{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
			{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
			{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
	//Q:5
	@Test
	public void testChesspattern() {
		assertEquals(s, x.Chess(8,8));
		
		
	}
	@Test
	public void testNullChessPattern() {
		assertNull( x.Chess(8, 7));
	}
	
	@Test
	public void testNotEquality() {
		assertNotEquals(s1, x.Chess(8, 8));
	}
	
	
	
	//Q:6
	@Test
	public void testConsecutiveNumbers() {
		
		assertEquals("non consecutive numbers", x.Consecutive("1,2,3,4,5,6,6"));
		
		
	} 
	
	@Test
	public void testConsecutiveFailure() {
		assertNotEquals("consecutive number", x.Consecutive("54,53,52,51,50,49,48"));
	}
	
	@Test
	public void testCheckNull() {
		assertNotNull(x.Consecutive("54,53,52,51,50"));
	}
	
	// implies that value of array position should be returned
	//Q:8
	@Test
	public void testGenerateException() {
		
		assertEquals("NullPointerException caught.", x.GenerateEx());
		
	}
	
	int[] array = { 1, 2, 3};
	int position3 = 3;// implies that value of array position should be returned
	@Test
	public void testArrayOutofBounds() {
		assertEquals("OutOfBounds", x.ArrayOutofBound(array, position3));
	}
	
	int size = -1;
	//int[] array1 = new int[size];
	int position2 = -1;// implies that value of array position should be returned
	@Test
	public void testArraySizeException() {
		assertEquals("null", x.NegativeArrayEx( position2));	
	}
	//Q:7
	
	
	
}
