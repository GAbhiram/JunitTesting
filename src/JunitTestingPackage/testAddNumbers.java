package JunitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		junit j=new junit();
		int result= j.AddNumbers(12,28);
		assertEquals(40,result);
	}

}
