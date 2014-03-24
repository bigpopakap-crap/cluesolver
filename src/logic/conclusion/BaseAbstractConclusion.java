package logic.conclusion;

import java.util.Arrays;
import java.util.List;

import logic.Reason;

abstract class BaseAbstractConclusion implements Conclusion {
	
	private List<Reason> reasons;
	
	protected BaseAbstractConclusion(Reason... reasons) {
		this(Arrays.asList(reasons));
	}
	
	protected BaseAbstractConclusion(List<Reason> reasons) {
		if (reasons == null) throw new IllegalArgumentException();
		if (reasons.isEmpty()) throw new IllegalArgumentException();
		this.reasons = reasons;
	}
	
	@Override
	public List<Reason> getReasons() {
		return reasons;
	}

}
