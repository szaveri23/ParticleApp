package ParticleApplet;

import static org.junit.Assert.*; 
import org.junit.Test;

public class test_ParticleCanvas {
	int d1 = 100;
	int d2 = 100;
	ParticleCanvas test = new ParticleCanvas(111);
	Particle[] p = {new Particle(d1,d2)};
	//Test the constructor 
	@Test
	public void testConstructor() {
		ParticleCanvas s = new ParticleCanvas(100);
		assertEquals(s.getX(), 100);
		assertEquals(s.getY(), 100);
	}
	@Test
	//Test SetParticles
	public void testSetParticles() {
		//assertEquals(d2, d1);
		test.setParticles(p);
		assertEquals(test.getParticles(), new Particle(d1,d2));
	}
	@Test
	public void testGetParticles() {
		
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
