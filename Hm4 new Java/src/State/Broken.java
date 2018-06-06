package State;

import game.racers.Racer;

public class Broken implements State {
	public Broken() {
		
	}

	@Override
	public void setState(Racer racer) {
		racer.setState(this);
	}
	
	
}
