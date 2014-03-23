package deduction;

import game.GameInfo;

import java.util.List;

public interface Conclusion {
	
	public void apply(GameInfo info);
	public List<Reason> getReasons();

}
