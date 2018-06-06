package game.racers.decorator;

import game.racers.IRacer;

public abstract class RacerDecorator implements IRacer {

	private IRacer decoratedRacer;
	
	public RacerDecorator(IRacer racer){
		this.decoratedRacer = racer;
	}
	
		
	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		
	}
	

}
