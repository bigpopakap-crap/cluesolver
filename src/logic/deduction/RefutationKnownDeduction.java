package logic.deduction;

import game.Game;

import java.util.Collections;
import java.util.List;

import logic.conclusion.Conclusion;

public class RefutationKnownDeduction implements Deduction {
	
	@Override
	public List<Conclusion> run(Game game) {
		System.out.println("Running unimplemented deduction: " + getClass().getName());
		return Collections.emptyList();
	}

}
