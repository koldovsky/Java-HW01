import static org.junit.Assert.*;

import org.junit.Test;

public class FlowerBedTest {

	@Test
	public void testCalcCircumference() {
		FlowerBed flowerBed = new FlowerBed();
		double actual = flowerBed.calcCircumference(1.0);
		double expected = 2 * Math.PI;
		assertEquals(actual, expected, 0.001);
	}

}
