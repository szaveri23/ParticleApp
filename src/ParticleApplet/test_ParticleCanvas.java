package ParticleApplet;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_ParticleCanvas {
	int d1 = 100;
	int d2 = 100;
	
	//Test the constructor 
	@Test
	public void testConstructor() {
		ParticleCanvas s = new ParticleCanvas(100);
		assertEquals(s.getX(), 100);
		assertEquals(s.getY(), 100);
	}
	//Test SetParticles
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
