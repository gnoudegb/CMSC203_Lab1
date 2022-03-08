import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester2 {
	private GradeBook gradebook1, gradebook2;

	@BeforeEach
	void setUp() throws Exception {
	gradebook1= new GradeBook (5);
	gradebook1.addScore(87);
	gradebook1.addScore(89);
	gradebook1.addScore(89);
	gradebook1.addScore(90);
	gradebook1.addScore(96);
	gradebook2 = new GradeBook (5);
	gradebook2.addScore(96);
	gradebook2.addScore(94);
	gradebook2.addScore(92);
	gradebook2.addScore(91);
	gradebook2.addScore(90);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = gradebook2 = null;
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5, gradebook1.getScoreSize());
		assertEquals(5, gradebook2 .getScoreSize());
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue("87 89 89 90 96".equals(gradebook1.toString()));
		assertTrue("96 94 92 91 90".equals(gradebook2.toString()));
	}

	@Test
	void testSum() {
		assertEquals(451, gradebook1.sum());
		assertEquals(463, gradebook2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(87, gradebook1.minimum());
		assertEquals(90, gradebook2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(364, gradebook1.finalScore());
		assertEquals(373, gradebook2.finalScore());
	}

}
