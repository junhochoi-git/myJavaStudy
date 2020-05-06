package example_inheritance;

public class TV_SingleInhert {
	//member
	boolean power;
	int channel;
	//method;
	void power() {power=!power;}
	void channelUp() {++channel;}
	void channelDown() {if(channel>0){--channel;} }
	
}
