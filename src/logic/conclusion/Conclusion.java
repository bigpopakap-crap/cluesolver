package logic.conclusion;

import game.GameInfo;

import java.util.List;

import logic.Reason;

public interface Conclusion {
	
	public void apply(GameInfo info);
	public String getMessage();
	public List<Reason> getReasons();
	
	/*
	 * TODO have conclusions implement equals, hashcode and compare so
	 * 		that if mutliple deduction rules come up with the same conclusion,
	 * 		then the reasons can be collapsed
	 */

}
