package deduction;

import game.GameInfo;
import game.GameState;

import java.util.List;

public interface DeductionRule {
	
	public List<Conclusion> run(GameState state, GameInfo info);

}
