package logic.deduction;

import game.Game;

import java.util.List;

import logic.conclusion.Conclusion;

public interface Deduction {
	
	public List<Conclusion> run(Game game);

}
