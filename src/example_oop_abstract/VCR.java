package example_oop_abstract;
/*
 * part of a inter face example 
 */
public class VCR {
	protected int counter; // VCR д╚©Нем
	public void play() {
		//player tape
	}
	public void stop() {
		//stop playing
	}
	public void reset() {
		counter =0;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int c) {
		counter = c;
	}
}
