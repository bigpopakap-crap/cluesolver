package game;

import java.util.List;

import logic.Suggestion;

import player.Player;
import card.Card;
import card.CardList;

public interface GameState {
	
	public List<Player> getPlayers();
	public CardList getCardList();

	public int getNumCardsForPlayer(Player player);
	
	public List<Card> getMyCards();
	
	public List<Suggestion> getSuggestions();
	
}
