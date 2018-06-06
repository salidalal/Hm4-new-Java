package State;

import game.racers.Racer;

public class Completed implements State {
	Completed(){
		
	}

	@Override
	public void setState(Racer racer) {
		racer.setState(this);
	}
}
