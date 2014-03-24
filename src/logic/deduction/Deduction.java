package logic.deduction;

import game.GameInfo;
import game.GameState;

import java.util.List;

import logic.ConclusionAndReasons;

public interface Deduction {
	
	public List<ConclusionAndReasons> run(GameState state, GameInfo info);

}
