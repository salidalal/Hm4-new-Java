package game.racers.state;

import game.racers.Racer;

public class Active implements RacerState {
	
	public Active() {
	}

	@Override
	public void notifyArena(Racer racer) {
		racer.setState(this);

	}

}
