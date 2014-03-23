package card;

import misc.Copyable;
import misc.NamedObject;

public interface Card extends NamedObject, Copyable<Card> {

	public CardType getType();
	
}