package card;

/*
 * TODO JAVA8: this class can be replaced by default methods in the Card interface
 */
abstract class BaseAbstractCard implements Card {
	
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
