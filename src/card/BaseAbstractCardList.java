package card;

//TODO this class can be replaced by default methods in the interface
abstract class BaseAbstractCardList implements CardList {
	
	@Override
	public boolean contains(String cardName) {
		return contains(getCardByName(cardName));
	}

}
