package card;

public class Weapon extends BaseAbstractCard {
	
	public Weapon(String name) {
		super(name);
	}
	
	public CardType getType() {
		return CardType.WEAPON;
	}
	
	@Override
	public Weapon copy() {
		return new Weapon(getName());
	}

}
