package checklist;

import card.CardList;

public interface ChecklistBuilder {
	
	public void withPlayers(String... players);
	public void withCardSet(CardList cardSet);
	
	public Checklist build();

}
