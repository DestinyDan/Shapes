package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;

public class CuboidTest {
	
	// create new cuboid objects
	Cuboid cuboid1 = new Cuboid(5.5f, 5.5f, 5.5f);
	Cuboid cuboid2 = new Cuboid(1.2f, 2.2f, 3.2f);
	Cuboid cuboid3 = new Cuboid(4.0f, 2.0f, 6.0f);

	// test surface area, 3 times
	@Test
	public void testSurfaceArea1() {
		assertEquals(181.50, cuboid1.surfaceArea(), 0.02f);
	}
	
	@Test
	public void testSurfaceArea2() {
		assertEquals(27.04, cuboid2.surfaceArea(), 0.02f);
	}
	
	@Test
	public void testSurfaceArea3() {
		assertEquals(88.00, cuboid3.surfaceArea(), 0.02f);
	}

	// test volume, 3 times
	@Test
	public void testVolume1() {
		assertEquals(166.38, cuboid1.volume(), 0.02f);
	}

	@Test
	public void testVolume2() {
		assertEquals(8.45, cuboid2.volume(), 0.02f);
	}
	
	@Test
	public void testVolume3() {
		assertEquals(48.00, cuboid3.volume(), 0.02f);
	}
	
	// test width
	@Test
	public void testGetWidth() {
		assertEquals(4.0, cuboid3.getWidth(), 0.02f);
	}

	// test height
	@Test
	public void testGetHeight() {
		assertEquals(2.0, cuboid3.getHeight(), 0.02f);
	}
	
	// test length
	@Test
	public void testGetDepth() {
		assertEquals(6.0, cuboid3.getDepth(), 0.02f);
	}
}
