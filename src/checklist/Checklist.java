package checklist;


import java.util.List;

import misc.Copyable;
import player.Player;
import card.Card;
import deduction.Reason;

public interface Checklist extends Copyable<Checklist> {
	
	public ChecklistValue getCaseFileValue(Card card);
	public ChecklistValue getMyValue(Card card);
	public ChecklistValue getValue(Player player, Card card);
	
	public List<Reason> getCaseFileReasons(Card card);
	public List<Reason> getMyReasons(Card card);
	public List<Reason> getReasons(Player player, Card card);
	
	public void setCaseFileValue(Card card, ChecklistValue value, List<Reason> reasons);
	public void setMyValue(Card card, ChecklistValue value, List<Reason> reasons);
	public void setValue(Player player, Card card, ChecklistValue value, List<Reason> reasons);
	
}
