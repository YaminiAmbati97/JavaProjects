package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Main.Main;

public class MainTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testCalculation() {
		Main market = new Main();
		assertEquals(700, market.Calculation(1000, 1));
	}

	@Test
	void testCalculation1() {
		Main market = new Main();
		assertEquals(900, market.Calculation(1000, 2));
	}

	@Test
	void testCalculation2() {
		Main market = new Main();
		assertEquals(950, market.Calculation(1000, 3));
	}

	@Test
	void testCalculation3() {
		Main market = new Main();
		assertEquals(700, market.Calculation(1000, 1));
	}

}
