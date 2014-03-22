package card;

public class SimpleWeapon extends AbstractSimpleCard {
	
	public SimpleWeapon(String name) {
		super(name);
	}
	
	public CardType getType() {
		return CardType.WEAPON;
	}
	
	@Override
	public SimpleWeapon copy() {
		return new SimpleWeapon(getName());
	}

}
