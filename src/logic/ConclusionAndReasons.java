package logic;

import java.util.Arrays;
import java.util.List;

import logic.conclusion.Conclusion;

public class ConclusionAndReasons {
	
	private Conclusion conclusion;
	private List<Reason> reasons;
	
	public ConclusionAndReasons(Conclusion conclusion, Reason... reasons) {
		this(conclusion, Arrays.asList(reasons));
	}
	
	public ConclusionAndReasons(Conclusion conclusion, List<Reason> reasons) {
		if (conclusion == null) throw new IllegalArgumentException();
		if (reasons == null) throw new IllegalArgumentException(); //must have a reason
		if (reasons.isEmpty()) throw new IllegalArgumentException();
		
		this.conclusion = conclusion;
		this.reasons = reasons;
	}
	
	public Conclusion getConclusion() {
		return conclusion;
	}
	
	public List<Reason> getReasons() {
		return reasons;
	}

}
