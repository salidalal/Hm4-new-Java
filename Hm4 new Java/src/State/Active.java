package State;

import game.racers.Racer;

public class Active implements State {

	@Override
	public void setState(Racer racer) {

		racer.setState(this);
	}

	
}
