package logic;

import game.GameInfo;
import game.GameState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import logic.conclusion.Conclusion;
import logic.deduction.Deduction;
import logic.deduction.HorizontalUniquenessDeduction;
import logic.deduction.HorizontalUniquenessInverseDeduction;

public class DeductionRunner implements Deduction {
	
	//TODO use a builder so that you can easily choose not to use all deductions
	
	private static final List<Deduction> DEDUCTIONS = Arrays.asList(
		new HorizontalUniquenessDeduction(),
		new HorizontalUniquenessInverseDeduction()
	);

	@Override
	public List<Conclusion> run(GameState state, GameInfo info) {
		List<Conclusion> conclusions = new ArrayList<>();
		
		boolean conclusionsAdded;
		do {
			conclusionsAdded = false;
			for (Deduction deduction : DEDUCTIONS) {
				List<Conclusion> deductionConclusions = deduction.run(state, info);
				
				if (!deductionConclusions.isEmpty()) {
					conclusionsAdded = true;
					conclusions.addAll(deductionConclusions);
				}
			}
		}
		while (conclusionsAdded);
		
		return conclusions;
	}

}
