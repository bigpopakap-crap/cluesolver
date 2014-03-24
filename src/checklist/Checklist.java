package checklist;


import java.util.List;

import logic.Reason;
import misc.Copyable;
import player.Player;
import card.Card;

public interface Checklist extends Copyable<Checklist> {
	
	public ChecklistValue getValue(Player player, Card card);
	public List<Reason> getReasons(Player player, Card card);
	public void setValue(Player player, Card card, ChecklistValue value, List<Reason> reasons);
	
}
