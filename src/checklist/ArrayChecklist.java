package checklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import card.Card;
import card.CardList;
import deduction.Reason;

class ArrayChecklist implements Checklist {
	
	private static final int CASE_FILE_INDEX = 0;
	private static final int MY_INDEX = CASE_FILE_INDEX + 1;
	private static final int OTHER_PLAYERS_MIN_INDEX = MY_INDEX + 1;
	
	private final ChecklistCell[][] checklist;
	private final List<String> playerList;
	private final CardList cardList;
	
	public ArrayChecklist(List<String> players, CardList cardList) {
		if (players == null) throw new IllegalArgumentException();
		if (cardList == null) throw new IllegalArgumentException();
		
		this.playerList = new ArrayList<>(players.size());
		for (String player : players) {
			if (player == null) throw new IllegalArgumentException();
			this.playerList.add(player);
		}
		
		this.cardList = cardList.copy();
		
		this.checklist = new ChecklistCell
							[OTHER_PLAYERS_MIN_INDEX + this.playerList.size()]
							[this.cardList.getAll().size()];
	}
	
	@Override
	public ChecklistValue getCaseFileValue(Card card) {
		return getCaseFileCell(card).getValue();
	}

	@Override
	public ChecklistValue getMyValue(Card card) {
		return getMyCell(card).getValue();
	}

	@Override
	public ChecklistValue getValue(String player, Card card) {
		return getCell(player, card).getValue();
	}

	@Override
	public List<Reason> getCaseFileReasons(Card card) {
		return getCaseFileCell(card).getReasons();
	}

	@Override
	public List<Reason> getMyReasons(Card card) {
		return getMyCell(card).getReasons();
	}

	@Override
	public List<Reason> getReasons(String player, Card card) {
		return getCell(player, card).getReasons();
	}

	@Override
	public void setCaseFileValue(Card card, ChecklistValue value, List<Reason> reasons) {
		getCaseFileCell(card).set(value, reasons);
	}

	@Override
	public void setMyValue(Card card, ChecklistValue value, List<Reason> reasons) {
		getMyCell(card).set(value, reasons);
	}

	@Override
	public void setValue(String player, Card card, ChecklistValue value, List<Reason> reasons) {
		getCell(player, card).set(value, reasons);
	}
	
	private ChecklistCell getCaseFileCell(Card card) {
		return get(CASE_FILE_INDEX, resolveCardToIndex(card));
	}

	private ChecklistCell getMyCell(Card card) {
		return get(MY_INDEX, resolveCardToIndex(card));
	}

	private ChecklistCell getCell(String player, Card card) {
		return get(resolvePlayerToIndex(player), resolveCardToIndex(card));
	}
	
	private ChecklistCell get(int playerIdx, int cardIdx) {
		return checklist[playerIdx][cardIdx];
	}
	
	private int resolvePlayerToIndex(String player) {
		if (player == null) throw new IllegalArgumentException();
		return OTHER_PLAYERS_MIN_INDEX + Collections.binarySearch(playerList, player);
	}
	
	private int resolveCardToIndex(Card card) {
		if (card == null) throw new IllegalArgumentException();
		return Collections.binarySearch(cardList.getAll(), card);
	}
	
	@Override
	public Checklist copy() {
		return new ArrayChecklist(this.playerList, this.cardList);
	}

}
