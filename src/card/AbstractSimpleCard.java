package card;

abstract class AbstractSimpleCard extends BaseAbstractCard {
	
	private final String name;
	
	public AbstractSimpleCard(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

}
