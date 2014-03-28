package main;

import ui.commandline.CommandLineUI;

public class Main {
	
	public static void main(String[] args) throws Exception {
		CommandLineUI ui = new CommandLineUI();
		
		ui.start();
		ui.listCommands();
		while (ui.isRunning()) {
			ui.acceptCommand();
		}
		
		ui.displaySuggestions();
		ui.displayChecklist();
	}

}
