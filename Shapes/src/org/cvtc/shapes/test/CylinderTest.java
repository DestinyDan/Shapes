package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest {
	
	// Create cylinder test objects
		Cylinder cylinder1 = new Cylinder(5.5f, 5.5f);
		Cylinder cylinder2 = new Cylinder(10.5f, 2.5f);
		Cylinder cylinder3 = new Cylinder(12.5f, 6.5f);

		// Test Surface Area, 3 times
		@Test
		public void testSurfaceArea1() {
			assertEquals(380.13, cylinder1.surfaceArea(), 0.02f);
		}
		
		@Test
		public void testSurfaceArea2() {
			assertEquals(857.65, cylinder2.surfaceArea(), 0.02f);
		}
		
		@Test
		public void testSurfaceArea3() {
			assertEquals(1492.26, cylinder3.surfaceArea(), 0.02f);
		}

		// Test Volume, 3 times
		@Test
		public void testVolume1() {
			assertEquals(522.68, cylinder1.volume(), 0.02f);
		}
		
		@Test
		public void testVolume2() {
			assertEquals(865.9, cylinder2.volume(), 0.02f);
		}
		
		@Test
		public void testVolume3() {
			assertEquals(3190.68, cylinder3.volume(), 0.02f);
		}

		// test Radius
		@Test
		public void testGetRadius() {
			assertEquals(5.5, cylinder1.getRadius(), 0.02f);
		}
		
		// test height
		@Test
		public void testGetHeight() {
			assertEquals(5.5, cylinder1.getHeight(), 0.02f);
		}
}
