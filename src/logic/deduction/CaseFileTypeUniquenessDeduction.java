package logic.deduction;

import game.GameInfo;
import game.GameState;

import java.util.Collections;
import java.util.List;

import logic.conclusion.Conclusion;

public class CaseFileTypeUniquenessDeduction implements Deduction {
	
	@Override
	public List<Conclusion> run(GameState state, GameInfo info) {
		System.out.println("Running unimplemented deduction: " + getClass().getName());
		return Collections.emptyList();
	}

}
