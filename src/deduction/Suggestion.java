package deduction;

import java.util.List;

import card.Card;
import card.SimpleRoom;
import card.SimpleSuspect;
import card.SimpleWeapon;

public interface Suggestion {
	
	public String getGuesser();
	
	public SimpleSuspect getSuspect();
	public SimpleWeapon getWeapon();
	public SimpleRoom getRoom();
	
	public String getRefuter();
	public Card getRefuteCard();
	
	public List<Conclusion> getConclusions();
	public boolean isFullyDeduced();
	
}
