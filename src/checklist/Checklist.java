package checklist;

import java.util.List;

import card.Card;
import deduction.Reason;

public interface Checklist {
	
	public ChecklistValue getCaseFileValue(Card card);
	public ChecklistValue getMyValue(Card card);
	public ChecklistValue getValue(String player, Card card);
	
	public List<Reason> getCaseFileReasons(Card card);
	public List<Reason> getMyReasons(Card card);
	public List<Reason> getReasons(String player, Card card);
	
	public void setCaseFileValue(Card card, ChecklistValue value, List<Reason> reasons);
	public void setMyValue(Card card, ChecklistValue value, List<Reason> reasons);
	public void setValue(String player, Card card, ChecklistValue value, List<Reason> reasons);
	
	public Checklist copy();
	
}
