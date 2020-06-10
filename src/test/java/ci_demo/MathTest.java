package ci_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void testSum() {
		assertEquals(2, Math.sum(1,1));
	}

}
