package logic.conclusion;

import java.util.Arrays;
import java.util.List;

import logic.Reason;
import player.Player;
import card.Card;
import checklist.ChecklistValue;

public class PlayerDefinitelyDoesNotHaveCardConclusion extends BaseAbstractPlayerCardCheckListValueConclusion {

	public PlayerDefinitelyDoesNotHaveCardConclusion(Player player, Card card, Reason... reasons) {
		this(player, card, Arrays.asList(reasons));
	}
	
	public PlayerDefinitelyDoesNotHaveCardConclusion(Player player, Card card, List<Reason> reasons) {
		super(player, card, reasons);
	}

	@Override
	protected ChecklistValue getChecklistValue() {
		return ChecklistValue.DEFINITELY_DOES_NOT_HAVE;
	}
	
}
