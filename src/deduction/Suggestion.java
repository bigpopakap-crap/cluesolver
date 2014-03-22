package deduction;

import java.util.List;

import card.Card;
import card.Room;
import card.Suspect;
import card.Weapon;

public interface Suggestion {
	
	public String getGuesser();
	
	public Suspect getSuspect();
	public Weapon getWeapon();
	public Room getRoom();
	
	public String getRefuter();
	public Card getRefuteCard();
	
	public List<Conclusion> getConclusions();
	public boolean isFullyDeduced();
	
}
