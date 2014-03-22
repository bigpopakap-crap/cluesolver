package card;

abstract class BaseAbstractCardList implements CardList {
	
	@Override
	public boolean contains(String cardName) {
		return contains(getCardByName(cardName));
	}

}
