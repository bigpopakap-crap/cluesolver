package card;

import java.util.List;

public interface CardList {

	public List<Card> getAll();
	public List<SimpleSuspect> getSuspects();
	public List<SimpleWeapon> getWeapons();
	public List<SimpleRoom> getRooms();
	
	public Card getCardByName(String cardName);
	
	public boolean contains(Card card);
	public boolean contains(String cardName);
	
	public CardList copy();
	
}
