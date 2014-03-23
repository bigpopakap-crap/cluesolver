package deduction;

import game.GameState;

import java.util.Collections;
import java.util.List;

public enum DeductionRules implements DeductionRule {
	HORIZONTAL_UNIQUENESS,
	HORIZONTAL_UNIQUENESS_INVERSE,
	
	VERTICAL_EXACTNESS,
	VERTICAL_EXACTNESS_INVERSE,
	
	CASE_FILE_TYPE_UNIQUENESS,
	CASE_FILE_TYPE_UNIQUENESS_INVERSE,
	
	REFUTATION_PASSED,
	REFUTATION_SEEN,
	REFUTATION_KNOWN,
	REFUTATION_DEDUCED;

	@Override
	public List<Conclusion> run(GameState state) {
		// default: don't do anything
		return Collections.emptyList();
	}
	
}
