package card;

class SimpleRoom extends BaseAbstractCard implements Room {
	
	public SimpleRoom(String name) {
		super(name);
	}
	
	public CardType getType() {
		return CardType.SUSPECT;
	}
	
	@Override
	public Room copy() {
		return new SimpleRoom(getName());
	}

}
