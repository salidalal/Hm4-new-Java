package factory.builder;

import factory.ArenaFactory;
import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;

public class Race implements RacePlan{
	
	private Arena arena;
	
	public Race() {
	}

	
	@Override
	public void setArena(String arena) {
		this.arena = (new ArenaFactory()).getArena(arena);
	}
	
	
	@Override
	public void setRacer(Racer racer) {
		
		try {
			arena.addRacer(racer.makeCopy());
		} catch (RacerLimitException e) {
			e.printStackTrace();
		} catch (RacerTypeException e) {
			e.printStackTrace();
		}
		
	}

}
