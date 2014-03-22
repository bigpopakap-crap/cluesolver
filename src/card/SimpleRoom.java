package card;

public class SimpleRoom extends AbstractSimpleCard {
	
	public SimpleRoom(String name) {
		super(name);
	}
	
	public CardType getType() {
		return CardType.SUSPECT;
	}
	
	@Override
	public SimpleRoom copy() {
		return new SimpleRoom(getName());
	}

}
