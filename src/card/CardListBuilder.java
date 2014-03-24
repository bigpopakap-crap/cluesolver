package card;

import java.util.List;

import misc.Builder;

public interface CardListBuilder extends Builder<CardList> {
	
	public void withSuspects(Suspect... suspects);
	public void withSuspects(List<Suspect> suspects);
	
	public void withWeapons(Weapon... weapons);
	public void withWeapons(List<Weapon> weapons);
	
	public void withRooms(Room... rooms);
	public void withRooms(List<Room> rooms);
	
}
