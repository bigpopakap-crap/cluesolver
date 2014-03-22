package card;

public interface CardListBuilder {
	
	public void withSuspects(Suspect... suspects);
	public void withWeapons(Weapon... weapons);
	public void withRooms(Room... rooms);
	
	public CardList build();

}
