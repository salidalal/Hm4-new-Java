package game.racers.state;

import State.State;
import game.racers.Racer;

public class Active implements State {
	
	public Active() {
		
	}
	
	
	@Override
	public void setState(Racer racer) {
		racer.setState(this);		
	}
	
}
