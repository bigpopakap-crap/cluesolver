package game;

import java.util.List;

import player.Player;
import card.Card;
import card.CardList;
import deduction.Suggestion;

public interface GameState {
	
	public List<Player> getPlayers();
	public CardList getCardList();

	public int getNumCardsForPlayer(Player player);
	
	public List<Card> getMyCards();
	
	public List<Suggestion> getSuggestions();
	
}
