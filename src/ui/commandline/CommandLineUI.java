package ui.commandline;

import game.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import logic.SimpleSuggestion;
import player.Player;
import player.SimplePlayer;
import card.Card;
import card.Room;
import card.SimpleRoom;
import card.SimpleSuspect;
import card.SimpleWeapon;
import card.Suspect;
import card.Weapon;

/**
 * This is a stupidly written hard-coded class, but it gets the job done
 * for manual testing
 * 
 * @author Kapil
 *
 */
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
	
	public void acceptCommand() throws IOException {
		out.print(">> ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line = reader.readLine().toLowerCase().toLowerCase();
		
		if (line.startsWith("help")) {
			listCommands();
		}
		else if (line.startsWith("sugg")) {
			addSuggestion(line.substring("sugg".length()));
		}
		else if (line.startsWith("list")) {
			displaySuggestions();
		}
		else if (line.startsWith("check")) {
			displayChecklist();
		}
		else if (line.startsWith("exit") || line.startsWith("end")) {
			end();
		}
		else {
			out.println("unrecognized command. type 'help' to list commands");
		}
		
		out.println();
	}
	
	public void listCommands() {
		out.println("help");
		out.println("sugg <guesser> <suspect> <weapon> <room> [refuter] [card type]:[refute card]");
		out.println("list");
		out.println("check");
		out.println("exit | end");
	}

	public void addSuggestion(String input) {
		String[] tokens = input.split(" ");
		
		//TODO need a suggestion builder to build suggestions
		//		by looking up cards and player names to make sure they exist
		if (tokens.length < 4) {
			out.println("wrong number of args. use 'help' to see expected format");
		}
		else {
			Player guesser = new SimplePlayer(tokens[0]);
			Suspect suspect = new SimpleSuspect(tokens[1]);
			Weapon weapon = new SimpleWeapon(tokens[2]);
			Room room = new SimpleRoom(tokens[3]);
			
			Player refuter = null;
			if (tokens.length >= 5) {
				refuter = new SimplePlayer(tokens[4]);
			}
			
			Card refuteCard = null;
			if (tokens.length >= 6) {
				String[] tokens2 = tokens[5].split(":");
				if ("S".equals(tokens[0])) {
					refuteCard = new SimpleSuspect(tokens2[1]);
				}
				else if ("W".equals(tokens[0])) {
					refuteCard = new SimpleWeapon(tokens2[1]);
				}
				else if ("R".equals(tokens[0])) {
					refuteCard = new SimpleRoom(tokens2[1]);
				}
			}
			
			game.getState().addSuggestion(new SimpleSuggestion(guesser, suspect, weapon,
												room, refuter, refuteCard));
		}
	}

	public void displayChecklist() {
		out.println(game.getInfo().getChecklist());
	}

	public void displaySuggestions() {
		out.println(game.getState().getSuggestions());
	}

	public void end() {
		isRunning = false;
	}

}
