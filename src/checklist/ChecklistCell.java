package checklist;

import java.util.LinkedList;
import java.util.List;

import deduction.Reason;

class ChecklistCell {
	
	private ChecklistValue value;
	private List<Reason> reasons;
	
	public ChecklistCell() {
		set(ChecklistValue.UNKNOWN, null);
	}
	
	public ChecklistValue getValue() {
		return value;
	}
	
	public List<Reason> getReasons() {
		return reasons;
	}
	
	public void set(ChecklistValue value, List<Reason> reasons) {
		if (reasons == null) reasons = new LinkedList<>();
		
		switch (value) {
			case UNKNOWN:
				this.value = value;
				this.reasons = new LinkedList<>();
				break;
				
			case DEFINITELY_DOES_HAVE:
			case DEFINITELY_DOES_NOT_HAVE:
				if (getValue() != value) {
					this.reasons = new LinkedList<>();
				}
				this.value = value;
				this.reasons.addAll(reasons);
				break;
		}
	}
	
}