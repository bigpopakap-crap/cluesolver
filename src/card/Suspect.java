package card;

public class Suspect extends BaseAbstractCard {
	
	public Suspect(String name) {
		super(name);
	}
	
	@Override
	public CardType getType() {
		return CardType.SUSPECT;
	}
	
	@Override
	public Suspect copy() {
		return new Suspect(getName());
	}
	
}
