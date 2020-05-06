package example_inheritance;

public class SingleInheritance extends TV_SingleInhert{
	
	VCR_SIngleInhert vcr = new VCR_SIngleInhert();
	int contuer = vcr.counter;
	
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}

}
