package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {
	
	// Create sphere test objects
	Sphere sphere1 = new Sphere(5.5f);
	Sphere sphere2 = new Sphere(10.5f);
	Sphere sphere3 = new Sphere(24.0f);

	// Test Surface Area, 3 times
	@Test
	public void testSurfaceArea1() {
		assertEquals(380.13, sphere1.surfaceArea(), 0.02f);
	}
	
	@Test
	public void testSurfaceArea2() {
		assertEquals(1385.44, sphere2.surfaceArea(), 0.02f);
	}
	
	@Test
	public void testSurfaceArea3() {
		assertEquals(7238.23, sphere3.surfaceArea(), 0.02f);
	}

	// Test Volume, 3 times
	@Test
	public void testVolume1() {
		assertEquals(696.91, sphere1.volume(), 0.02f);
	}
	
	@Test
	public void testVolume2() {
		assertEquals(4849.05, sphere2.volume(), 0.02f);
	}
	
	@Test
	public void testVolume3() {
		assertEquals(57905.84, sphere3.volume(), 0.02f);
	}

	// test Radius
	@Test
	public void testGetRadius() {
		assertEquals(5.5, sphere1.getRadius(), 0.02f);
	}

}
