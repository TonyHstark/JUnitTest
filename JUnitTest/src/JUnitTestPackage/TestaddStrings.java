package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaddStrings {

	@Test
	void test() {
		JUnitFunction junitString = new JUnitFunction();
		String result = junitString.addString("tony"," stark");
		assertEquals("tony stark",result);
	}

}
