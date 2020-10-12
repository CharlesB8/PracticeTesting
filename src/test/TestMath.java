package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.MathUtil;


@DisplayName("Testing Math")
class TestMath {
	
	MathUtil calc;
	
	@BeforeEach
	void intit() {
//		Create instance
		
		calc = new MathUtil();
	
	}

	
	@DisplayName("Testing Addition")
	@Test
	void testAdd() {
		
// 		Expect 
		int expected = 2;
//		Actual 
		int actual = calc.add(1, 1);
// 		Verify 
		assertEquals(actual, expected);
			
	}
	
	@DisplayName("Testing Subtraction")
	@Test
	void testSubtract() {
//		Expected
		int expected = 3;
// 		Actual
		int actual = calc.subtract(6, 3);
// 		Verify
		assertEquals(actual, expected);
		
	}
	
	@DisplayName("Testing Devision")
	@Test 
	void testDivide() {
//		Expected 
		int expected = 3;
//		Actual 
		int actual = calc.devide(9, 3);
//		Verify 
		assertEquals(actual, expected);
	}
	
	@DisplayName("Testing Multiplication")
	@Test 
	void testMutiply() {
//		Expected 
		int expected = 6;
//		Actual 
		int actual = calc.mutiply(3, 2);
//		Verify 
		assertEquals(actual, expected);
	}
	
	@DisplayName("Find Circumfrence")
	@Test 
	void testCircumfrence() {
//		Expected 
		double expected = 12 * Math.PI;
//		Actual 
		double actual = calc.testCircumference(6);
//		Verify 
		assertEquals(actual, expected);
	}


}
