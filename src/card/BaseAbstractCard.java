package card;

abstract class BaseAbstractCard implements Card {
	
	private final String name;
	
	public BaseAbstractCard(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public int compareTo(Card card) {
		return getName().compareTo(card.getName());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || o instanceof Card) {
			return false;
		}
		
		Card card = (Card) o;
		
		if (getType() != card.getType()) {
			return false;
		}
		
		return getName() != null
					? getName().equals(card.getName())
					: card.getName() == null;
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}

}
