package checklist;

import misc.Builder;
import player.Player;
import card.CardList;

public interface ChecklistBuilder extends Builder<Checklist> {
	
	public void withPlayers(Player... players);
	public void withCardSet(CardList cardSet);
	
}
