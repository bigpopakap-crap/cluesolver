package ui;

import game.Game;

import java.io.InputStream;
import java.io.PrintStream;

public class CommandLineUI {
	
	private final InputStream in;
	private final PrintStream out;
	private Game game;
	
	public CommandLineUI() {
		this(System.in, System.out);
	}
	
	public CommandLineUI(InputStream in, PrintStream out) {
		this.in = in;
		this.out = out;
		this.game = createGame();
	}
	
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	public UIState getState() {
		// TODO Auto-generated method stub
		return null;
	}

	private Game createGame() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void acceptCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void listCommands() {
		// TODO Auto-generated method stub
		
	}

	public void addSuggestion() {
		// TODO Auto-generated method stub
		
	}

	public void displayChecklist() {
		// TODO Auto-generated method stub
		
	}

	public void displaySuggestions() {
		// TODO Auto-generated method stub
		
	}

	public void end() {
		// TODO Auto-generated method stub
		
	}

}
