package ui;

import game.Game;
import game.GameState;
import checklist.Checklist;

public interface ClueSolverUI {
	
	//creating and adding new info
	public Game createGame();
	public void addSuggestion(Game game);
	
	//editing existing info
	//TODO
	
	//viewing info
	public void displayChecklist(Checklist checklist);
	public void displaySuggestions(GameState gameState);

}
