package ParticleApplet;

import static org.junit.Assert.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import org.junit.Test;

public class test_Particle implements MouseMotionListener {

	int x = 5, y = 1;
	Particle q = new Particle(0, 0);
	Particle p = new Particle(1, 1);

	Particle[] qc1 = { q, p };

	@Test
	public void testConstructor() {
		Particle s = new Particle(x, y);
		assertEquals(x, s.x);
		assertEquals(y, s.y);
	}
	
	@Test
	public void test1(){
	      Particle q = new Particle(0, 0);
	      Particle p = new Particle(1, 1);
	      assertNotEquals(p, q);
	  }
	
	@Test
	public void test2move() {
		Particle sample = new Particle(x, y);
		sample.move();
		assertNotEquals(x, sample.x);
		assertNotEquals(y, sample.y);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}
}
