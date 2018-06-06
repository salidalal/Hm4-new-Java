package game.racers.decorator;

import game.racers.IRacer;
import game.racers.Racer;
import utilities.EnumContainer.Color;

public class ColoredRacer extends RacerDecorator {
	public String ATTRIBUTENAME ="color";
	public ColoredRacer(IRacer racer ,Color color) {
		super(racer);
		super.addAttribute(ATTRIBUTENAME, color);
	}
	@Override
	public void addAttribute(String str, Object obj) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Racer makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}

}
