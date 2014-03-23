package card;

class SimpleWeapon extends BaseAbstractCard implements Weapon {
	
	public SimpleWeapon(String name) {
		super(name);
	}
	
	public CardType getType() {
		return CardType.WEAPON;
	}
	
	@Override
	public Weapon copy() {
		return new SimpleWeapon(getName());
	}

}
