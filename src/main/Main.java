package main;

import ui.CommandLineUI;
import ui.UIState;

public class Main {
	
	public static void main(String[] args) {
		CommandLineUI ui = new CommandLineUI();
		
		ui.listCommands();
		ui.start();
		while (ui.getState() != UIState.ENDED) {
			ui.acceptCommand();
		}
		
		ui.displaySuggestions();
		ui.displayChecklist();
	}

}
