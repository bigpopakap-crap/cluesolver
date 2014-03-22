package card;

import java.util.List;

public interface CardList {

	public List<Card> getAll();
	public List<Suspect> getSuspects();
	public List<Weapon> getWeapons();
	public List<Room> getRooms();
	
	public Card getCardByName(String cardName);
	
	public boolean contains(Card card);
	public boolean contains(String cardName);
	
	public CardList copy();
	
}
