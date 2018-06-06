package factory;

import game.arenas.Arena;
import game.arenas.air.AerialArena;
import game.arenas.land.LandArena;
import game.arenas.naval.NavalArena;

public class ArenaFactory {
	public ArenaFactory(){
		
	}

	public Arena getArena(String arenaType) {
		Arena arena = null;
		if(arenaType.equals("AerialArena")==true) {
			arena =  new AerialArena();
		}
		if(arenaType.equals("LandArena")==true) {
			arena =  new LandArena();
		}
		if(arenaType.equals("NavalArena")==true) {
			arena =  new NavalArena();
		}
		return arena;
	}
}
