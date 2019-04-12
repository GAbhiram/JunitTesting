package JunitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		junit js=new junit();
		String result=js.AddString("Hello ", "World");
		assertEquals("Hello World",result);
	}

}
