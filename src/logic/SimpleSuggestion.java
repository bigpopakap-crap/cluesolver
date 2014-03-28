package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import logic.conclusion.Conclusion;
import player.Player;
import card.Card;
import card.Room;
import card.Suspect;
import card.Weapon;


public class SimpleSuggestion implements Suggestion {
	
	private Player guesser;
	
	private Suspect suspect;
	private Weapon weapon;
	private Room room;
	
	private Player refuter;
	private Card refuteCard;
	private List<Reason> refuteCardReasons;
	
	private List<Conclusion> conclusions;
	private boolean isFullyDeduced;
	
	public SimpleSuggestion(Player guesser, Suspect suspect, Weapon weapon, Room room) {
		this(guesser, suspect, weapon, room, null, null);
	}
	
	public SimpleSuggestion(Player guesser, Suspect suspect, Weapon weapon, Room room, Player refuter) {
		this(guesser, suspect, weapon, room, refuter, null);
	}
	
	public SimpleSuggestion(Player guesser, Suspect suspect, Weapon weapon, Room room,
							Player refuter, Card refuteCard) {
		this.guesser = guesser;
		this.suspect = suspect;
		this.weapon = weapon;
		this.room = room;
		this.refuter = refuter;
		this.refuteCard = refuteCard;
		
		this.refuteCardReasons = new ArrayList<>();
		if (isRefuteCardKnown()) {
			this.refuteCardReasons.add(Reason.USER_ENTERED);
		}
		
		this.conclusions = new ArrayList<>();
		this.isFullyDeduced = false;
	}
	
	@Override
	public Player getGuesser() {
		return guesser;
	}
	
	@Override
	public Suspect getSuspect() {
		return suspect;
	}
	
	@Override
	public Weapon getWeapon() {
		return weapon;
	}
	
	@Override
	public Room getRoom() {
		return room;
	}
	
	@Override
	public Player getRefuter() {
		return refuter;
	}
	
	@Override
	public Card getRefuteCard() {
		return refuteCard;
	}
	
	@Override
	public boolean isRefuted() {
		return getRefuter() != null;
	}
	
	@Override
	public boolean isRefuteCardKnown() {
		return getRefuteCard() != null;
	}
	
	@Override
	public List<Reason> getRefuteCardReasons() {
		return refuteCardReasons;
	}
	
	@Override
	public void setRefuter(Player player) {
		if (isRefuted()) {
			throw new IllegalStateException("this suggestion already had a refuter");
		}
		this.refuter = player;
	}
	
	@Override
	public void setRefuteCard(Card card, List<Reason> reasons) {
		if (!isRefuted()) {
			throw new IllegalStateException("cannot add refute card to unrefuted suggestion");
		}
		else if (isRefuteCardKnown()) {
			throw new IllegalStateException("this suggestion already had a refute card");
		}
		else {
			if (reasons == null) {
				reasons = Collections.emptyList();
			}
			this.refuteCard = card;
			this.refuteCardReasons = reasons;
		}
	}
	
	@Override
	public List<Conclusion> getConclusions() {
		return conclusions;
	}
	
	@Override
	public boolean isFullyDeduced() {
		return isFullyDeduced;
	}
	
	@Override
	public void addConclusions(List<Conclusion> conclusions) {
		if (conclusions == null) throw new IllegalArgumentException();
		conclusions.addAll(conclusions);
	}
	
	@Override
	public void setFullyDeduced() {
		isFullyDeduced = true;
	}
	
}
