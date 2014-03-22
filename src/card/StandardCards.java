package card;

import java.util.ArrayList;
import java.util.List;

public interface StandardCards {
	
	public static final Suspect SCARLET = new Suspect("Miss Scarlet");
	public static final Suspect MUSTARD = new Suspect("Colonel Mustard");
	public static final Suspect WHITE = new Suspect("Mrs. White");
	public static final Suspect GREEN = new Suspect("Mr. Green");
	public static final Suspect PEACOCK = new Suspect("Mrs. Peacock");
	public static final Suspect PLUM = new Suspect("Prof. Plum");
	
	public static final Weapon CANDLESTICK = new Weapon("Candlestick");
	public static final Weapon KNIFE = new Weapon("Knife");
	public static final Weapon PIPE = new Weapon("Lead Pipe");
	public static final Weapon REVOLVER = new Weapon("Revolver");
	public static final Weapon ROPE = new Weapon("Rope");
	public static final Weapon WRENCH = new Weapon("Wrench");
	
	public static final Room KITCHEN = new Room("Kitchen");
	public static final Room BALLROOM = new Room("Ballroom");
	public static final Room CONSERV = new Room("Conservatory");
	public static final Room DINING = new Room("Dining Room");
	public static final Room BILLIARD = new Room("Billiard Room");
	public static final Room LIBRARY = new Room("Library");
	public static final Room LOUNGE = new Room("Lounge");
	public static final Room HALL = new Room("Hall");
	public static final Room STUDY = new Room("Study");
	
	public static final List<Suspect> SUSPECTS = new ArrayList<Suspect>() {{
		add(SCARLET);
		add(MUSTARD);
		add(WHITE);
		add(GREEN);
		add(PEACOCK);
		add(PLUM);
	}};
	
	public static final List<Weapon> WEAPONS = new ArrayList<Weapon>() {{
		add(CANDLESTICK);
		add(KNIFE);
		add(PIPE);
		add(REVOLVER);
		add(ROPE);
		add(WRENCH);
	}};
	
	public static final List<Room> ROOMS = new ArrayList<Room>() {{
		add(KITCHEN);
		add(BALLROOM);
		add(CONSERV);
		add(DINING);
		add(BILLIARD);
		add(LIBRARY);
		add(LOUNGE);
		add(HALL);
		add(STUDY);
	}};
	
}
