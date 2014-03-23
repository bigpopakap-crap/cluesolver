package deduction;

import java.util.List;

import player.Player;
import card.Card;
import card.Room;
import card.Suspect;
import card.Weapon;

public interface Suggestion {
	
	//TODO allow setting of individual fields,
	//	and don't have Suggestion deal with reasons or conclusions
	
	public Player getGuesser();
	public Suspect getSuspect();
	public Weapon getWeapon();
	public Room getRoom();
	
	public Player getRefuter();
	public Card getRefuteCard();
	public boolean isRefuted(); //TODO JAVA8: add default method
	public boolean isRefuteCardKnown(); //TODO JAVA8: add default method
	public List<Reason> getRefuteCardReasons();
	public void setRefuter(Player player);
	public void setRefuteCard(Card card, List<Reason> reasons);
	
	public List<Conclusion> getConclusions();
	public boolean isFullyDeduced();
	public void addConclusions(List<Conclusion> conclusions);
	public void setFullyDeduced();
	
}
