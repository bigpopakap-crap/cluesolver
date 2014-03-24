package logic.deduction;

import game.GameInfo;
import game.GameState;

import java.util.List;
import java.util.Map;

import logic.Reason;
import logic.conclusion.Conclusion;

public interface Deduction {
	
	public Map<Conclusion, List<Reason>> run(GameState state, GameInfo info);

}
