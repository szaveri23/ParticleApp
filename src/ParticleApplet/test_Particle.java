package ParticleApplet;

import static org.junit.Assert.*; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import org.junit.Test;

public class test_Particle implements MouseMotionListener {
	
	//Testing variables
	int x = 5, y = 1;
	Particle q = new Particle(1, 1);
	Particle p = new Particle(2, 2);

	Particle[] qc1 = { q, p };

	//Test the constructor
	//Test if initalX and initialY of a Particle are correctly defined.
	@Test
	public void testConstructor() {
		Particle s = new Particle(x, y);
		assertEquals(x, s.x);
		assertEquals(y, s.y);
	}
	
	//Test to see if two different particles are not same
	@Test
	public void testParticles(){
	      Particle q = new Particle(1, 1);
	      Particle p = new Particle(2, 2);
	      assertNotEquals(p, q);
	  }
	
	//Test the move method
	//Move the sample with x and y and see if the values have changed
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
	
	//Test the mouse functions.
	
	//Test the mouseDragged() method
	//Test if the mouse has been dragged
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		assertNotEquals(x, e.getX());
		assertNotEquals(y, e.getY());
	}
	
	//Test the mouseMoved() method
	//move the mouse and see if the values have changed.
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		assertNotEquals(x, e.getX());
		assertNotEquals(y, e.getY());
	}
}
