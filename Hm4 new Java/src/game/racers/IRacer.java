package game.racers;

public interface IRacer extends Cloneable {
	public void addAttribute(String str,Object obj);
	public void introduce();
	public Racer makeCopy();
}
