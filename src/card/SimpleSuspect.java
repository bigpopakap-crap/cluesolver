package card;

public class SimpleSuspect extends AbstractSimpleCard {
	
	public SimpleSuspect(String name) {
		super(name);
	}
	
	@Override
	public CardType getType() {
		return CardType.SUSPECT;
	}
	
	@Override
	public SimpleSuspect copy() {
		return new SimpleSuspect(getName());
	}
	
}
