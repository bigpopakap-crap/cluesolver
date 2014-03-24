package logic;

import game.GameInfo;
import game.GameState;

import java.util.Arrays;
import java.util.List;

import logic.conclusion.Conclusion;
import logic.deduction.Deduction;

public class DeductionRunner implements Deduction {
	
	//TODO use a builder so that you can easily choose not to use all deductions
	
	private static final List<Deduction> DEDUCTIONS = Arrays.asList(
		
	);

	@Override
	public List<Conclusion> run(GameState state, GameInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

}
