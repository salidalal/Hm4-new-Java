package State;

import game.racers.Racer;

public class Disabled implements State{
	public Disabled() {
		
	}
	@Override
	public void setState(Racer racer) {
		racer.setState(this);
	}

}
