package card;

class SimpleSuspect extends BaseAbstractCard implements Suspect {
	
	public SimpleSuspect(String name) {
		super(name);
	}
	
	@Override
	public CardType getType() {
		return CardType.SUSPECT;
	}
	
	@Override
	public Suspect copy() {
		return new SimpleSuspect(getName());
	}
	
}
