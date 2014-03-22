package card;

public interface Card extends Comparable<Card> {

	public String getName();
	public CardType getType();
	
	public Card copy();
	
}
