package logic.deduction;

import game.GameInfo;
import game.GameState;

import java.util.List;

import logic.conclusion.Conclusion;

public interface Deduction {
	
	public List<Conclusion> run(GameState state, GameInfo info);

}
