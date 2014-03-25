package ui;

import game.Game;

import java.io.InputStream;
import java.io.PrintStream;

public class CommandLineUI {
	
	private final InputStream in;
	private final PrintStream out;
	private Game game;
	private boolean isRunning;
	
	public CommandLineUI() {
		this(System.in, System.out);
	}
	
	public CommandLineUI(InputStream in, PrintStream out) {
		this.in = in;
		this.out = out;
		this.game = null;
		this.isRunning = false;
	}
	
	public void start() {
		game = createGame();
		isRunning = true;
	}

	public boolean isRunning() {
		return isRunning;
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
