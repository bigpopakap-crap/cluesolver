package main;

import ui.CommandLineUI;

public class Main {
	
	public static void main(String[] args) {
		CommandLineUI ui = new CommandLineUI();
		
		ui.listCommands();
		ui.start();
		while (ui.isRunning()) {
			ui.acceptCommand();
		}
		
		ui.displaySuggestions();
		ui.displayChecklist();
	}

}
