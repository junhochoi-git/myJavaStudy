package example_oop_abstract;
/*
 * 0424 - using a interface for a multi- inheritance.
 */
public class Tv {
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() {power= !power;}
	public void channelUp() {++channel;}
	public void channelDown() {--channel;}
	public void volumeUp() {++volume;}
	public void volumeDown() {--volume;}
	
	
}
