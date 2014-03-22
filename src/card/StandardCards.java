package card;

import java.util.ArrayList;
import java.util.List;

public interface StandardCards {
	
	public static final Suspect SCARLET = new SimpleSuspect("Miss Scarlet");
	public static final Suspect MUSTARD = new SimpleSuspect("Colonel Mustard");
	public static final Suspect WHITE = new SimpleSuspect("Mrs. White");
	public static final Suspect GREEN = new SimpleSuspect("Mr. Green");
	public static final Suspect PEACOCK = new SimpleSuspect("Mrs. Peacock");
	public static final Suspect PLUM = new SimpleSuspect("Prof. Plum");
	
	public static final Weapon CANDLESTICK = new SimpleWeapon("Candlestick");
	public static final Weapon KNIFE = new SimpleWeapon("Knife");
	public static final Weapon PIPE = new SimpleWeapon("Lead Pipe");
	public static final Weapon REVOLVER = new SimpleWeapon("Revolver");
	public static final Weapon ROPE = new SimpleWeapon("Rope");
	public static final Weapon WRENCH = new SimpleWeapon("Wrench");
	
	public static final Room KITCHEN = new SimpleRoom("Kitchen");
	public static final Room BALLROOM = new SimpleRoom("Ballroom");
	public static final Room CONSERV = new SimpleRoom("Conservatory");
	public static final Room DINING = new SimpleRoom("Dining Room");
	public static final Room BILLIARD = new SimpleRoom("Billiard Room");
	public static final Room LIBRARY = new SimpleRoom("Library");
	public static final Room LOUNGE = new SimpleRoom("Lounge");
	public static final Room HALL = new SimpleRoom("Hall");
	public static final Room STUDY = new SimpleRoom("Study");
	
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
