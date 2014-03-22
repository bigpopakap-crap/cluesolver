package card;

public interface CardListBuilder {
	
	public void withSuspects(SimpleSuspect... suspects);
	public void withWeapons(SimpleWeapon... weapons);
	public void withRooms(SimpleRoom... rooms);
	
	public CardList build();

}
