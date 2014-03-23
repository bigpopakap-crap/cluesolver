package card;

import misc.Builder;

public interface CardListBuilder extends Builder<CardList> {
	
	public void withSuspects(Suspect... suspects);
	public void withWeapons(Weapon... weapons);
	public void withRooms(Room... rooms);
	
}
