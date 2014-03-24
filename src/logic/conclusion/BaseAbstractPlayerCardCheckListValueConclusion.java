package logic.conclusion;

import game.GameInfo;

import java.util.Arrays;
import java.util.List;

import logic.Reason;
import player.Player;
import card.Card;
import checklist.ChecklistValue;

abstract class BaseAbstractPlayerCardCheckListValueConclusion extends BaseAbstractConclusion {
	
	private final Player player;
	private final Card card;
	
	protected BaseAbstractPlayerCardCheckListValueConclusion(Player player, Card card, Reason... reasons) {
		this(player, card, Arrays.asList(reasons));
	}
	
	protected BaseAbstractPlayerCardCheckListValueConclusion(Player player, Card card, List<Reason> reasons) {
		super(reasons);
		
		if (player == null) throw new IllegalArgumentException();
		if (card == null) throw new IllegalArgumentException();
		this.player = player;
		this.card = card;
	}
	
	protected Player getPlayer() {
		return player;
	}
	
	protected Card getCard() {
		return card;
	}
	
	protected abstract ChecklistValue getChecklistValue();
	
	@Override
	public void apply(GameInfo info) {
		info.getChecklist().setValue(getPlayer(), getCard(), getChecklistValue(), getReasons());
	}
	
	public String getMessage() {
		String checklistValueStr;
		switch (getChecklistValue()) {
			case DEFINITELY_DOES_HAVE:
				checklistValueStr = "has";
				break;
			case DEFINITELY_DOES_NOT_HAVE:
				checklistValueStr = "does not have";
				break;
			case UNKNOWN:
				checklistValueStr = "might have";
				break;
			default:
				throw new IllegalStateException();
		}
		
		return new StringBuilder()
					.append(getPlayer())
					.append(" ")
					.append(checklistValueStr)
					.append(" ")
					.append(getCard())
				.toString();
	}

}
