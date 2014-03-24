package card;

import misc.BaseAbstractNamedObject;

/*
 * TODO JAVA8: this class can be replaced by default methods in the Card interface
 */
abstract class BaseAbstractCard extends BaseAbstractNamedObject implements Card {
	
	protected BaseAbstractCard(String name) {
		super(name);
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o)
			&& o instanceof Card
			&& getType() == ((Card) o).getType();
	}
	
}
