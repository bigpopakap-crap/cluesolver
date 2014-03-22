package card;

class SimpleWeapon extends AbstractSimpleCard implements Weapon {
	
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
