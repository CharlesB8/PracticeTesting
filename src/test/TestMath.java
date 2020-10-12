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
		System.out.println("Creating");
		calc = new MathUtil();
		System.out.println("Created");
	}

	
	@DisplayName("Testing Addition")
	@Test
	void testAdd() {
		
		// Expect 
				int expected = 2;
		// Actual 
				int actual = calc.add(1, 1);
		// Verify 
				assertEquals(actual, expected);
			
	}

}
