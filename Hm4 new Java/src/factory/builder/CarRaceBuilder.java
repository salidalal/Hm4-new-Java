package factory.builder;

import game.arenas.Arena;
import game.racers.Racer;
import game.racers.land.Car;

public class CarRaceBuilder {
	
	CarRaceBuilder(int n){
		Race arena = new Race();
		arena.setArena("LandArena");
		Racer car = new Car();
		
		for(int i=0;i<n;i++) {
			arena.setRacer(car);
		}
		
	}

}
