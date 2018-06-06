package game.racers;

public class CloneFactory {
	
	public IRacer getClone(IRacer racer) {
		return racer.makeCopy();
	}

}
