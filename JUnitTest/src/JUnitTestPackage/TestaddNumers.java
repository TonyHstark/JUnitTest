package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaddNumers {

	@Test
	void test() {
		JUnitFunction junit = new JUnitFunction();
		int result = junit.addNumbers(20, 20);
		assertEquals(40,result);
	}

}
