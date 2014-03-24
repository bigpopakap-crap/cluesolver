package checklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import logic.Reason;

import player.Player;
import card.Card;
import card.CardList;

class ArrayChecklist implements Checklist {
	
	private final ChecklistCell[][] checklist;
	private final List<Player> playerList;
	private final CardList cardList;
	
	/**
	 * @param players should *not* include {@link Player#CASE_FILE} or {@link Player#ME}
	 */
	public ArrayChecklist(List<Player> players, CardList cardList) {
		if (players == null) players = new ArrayList<Player>();
		if (cardList == null) throw new IllegalArgumentException();
		
		this.playerList = new ArrayList<>(players.size());
		this.playerList.add(Player.CASE_FILE);
		this.playerList.add(Player.ME);
		for (Player player : players) {
			if (player == null) throw new IllegalArgumentException();
			this.playerList.add(player);
		}
		
		this.cardList = cardList.copy();
		
		this.checklist = new ChecklistCell
							[this.playerList.size()]
							[this.cardList.getAll().size()];
	}
	
	@Override
	public ChecklistValue getValue(Player player, Card card) {
		return getCell(player, card).getValue();
	}

	@Override
	public List<Reason> getReasons(Player player, Card card) {
		return getCell(player, card).getReasons();
	}

	@Override
	public void setValue(Player player, Card card, ChecklistValue value, List<Reason> reasons) {
		getCell(player, card).set(value, reasons);
	}
	
	private ChecklistCell getCell(Player player, Card card) {
		return checklist
				[Collections.binarySearch(playerList, player)]
				[Collections.binarySearch(cardList.getAll(), card)];
	}
	
	@Override
	public Checklist copy() {
		return new ArrayChecklist(this.playerList, this.cardList);
	}

}
