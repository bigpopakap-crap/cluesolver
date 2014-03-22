package card;

public class Room extends BaseAbstractCard {
	
	public Room(String name) {
		super(name);
	}
	
	public CardType getType() {
		return CardType.SUSPECT;
	}
	
	@Override
	public Room copy() {
		return new Room(getName());
	}

}
