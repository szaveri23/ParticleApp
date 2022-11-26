package ParticleApplet;

import static org.junit.Assert.*; 
import org.junit.Test;

public class test_ParticleCanvas {
	//Testing variables
	int d1 = 100;
	int d2 = 100;
	ParticleCanvas test = new ParticleCanvas(111);
	Particle[] p = {new Particle(d1,d2)};
	Particle[] w = {new Particle(d1, d2)};
	
	//Test the constructor 
	//the constructor will set the size of the canvas.
	//Check if the size of the canvas is as intended.
	@SuppressWarnings("deprecation")
	@Test
	public void testConstructor() {
		ParticleCanvas s = new ParticleCanvas(100);

		assertEquals(s.size().height, 100);
		assertEquals(s.size().width, 100);
	}
	
	
	// Test the setParticles method
	// Test if the length is not 1
	// In the test Canvas, the size of the particles[] is 0
	@Test
	public void testSetParticles() {
		//assertEquals(d2, d1);
		test.setParticles(p);

		assertEquals(test.getParticles().length, 1);
	}
	
	//Test the getParticle method
	// getParticle() would return an array of particles.
	// Test if the particles returned match.
	@Test
	public void testGetParticles() {
		Particle[] v = test.getParticles();

		assertNotEquals(v, w);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
