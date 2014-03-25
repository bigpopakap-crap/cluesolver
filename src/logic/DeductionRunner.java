package logic;

import game.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import logic.conclusion.Conclusion;
import logic.deduction.CaseFileTypeUniquenessDeduction;
import logic.deduction.CaseFileTypeUniquenessInverseDeduction;
import logic.deduction.Deduction;
import logic.deduction.HorizontalUniquenessDeduction;
import logic.deduction.HorizontalUniquenessInverseDeduction;
import logic.deduction.RefutationDeducedDeduction;
import logic.deduction.RefutationKnownDeduction;
import logic.deduction.RefutationSeenDeduction;
import logic.deduction.VerticalExactnessDeduction;
import logic.deduction.VerticalExactnessInverseDeduction;

public class DeductionRunner implements Deduction {
	
	//TODO use a builder so that you can easily choose not to use all deductions
	
	private static final List<Deduction> DEDUCTIONS = Arrays.asList(
		new HorizontalUniquenessDeduction(),
		new HorizontalUniquenessInverseDeduction(),
		new VerticalExactnessDeduction(),
		new VerticalExactnessInverseDeduction(),
		new CaseFileTypeUniquenessDeduction(),
		new CaseFileTypeUniquenessInverseDeduction(),
		new RefutationDeducedDeduction(),
		new RefutationKnownDeduction(),
		new RefutationSeenDeduction()
	);

	@Override
	public List<Conclusion> run(Game game) {
		List<Conclusion> conclusions = new ArrayList<>();
		
		boolean conclusionsAdded;
		do {
			conclusionsAdded = false;
			for (Deduction deduction : DEDUCTIONS) {
				List<Conclusion> deductionConclusions = deduction.run(game);
				
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
