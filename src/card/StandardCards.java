package card;

import java.util.ArrayList;
import java.util.List;

public interface StandardCards {
	
	public static final SimpleSuspect SCARLET = new SimpleSuspect("Miss Scarlet");
	public static final SimpleSuspect MUSTARD = new SimpleSuspect("Colonel Mustard");
	public static final SimpleSuspect WHITE = new SimpleSuspect("Mrs. White");
	public static final SimpleSuspect GREEN = new SimpleSuspect("Mr. Green");
	public static final SimpleSuspect PEACOCK = new SimpleSuspect("Mrs. Peacock");
	public static final SimpleSuspect PLUM = new SimpleSuspect("Prof. Plum");
	
	public static final SimpleWeapon CANDLESTICK = new SimpleWeapon("Candlestick");
	public static final SimpleWeapon KNIFE = new SimpleWeapon("Knife");
	public static final SimpleWeapon PIPE = new SimpleWeapon("Lead Pipe");
	public static final SimpleWeapon REVOLVER = new SimpleWeapon("Revolver");
	public static final SimpleWeapon ROPE = new SimpleWeapon("Rope");
	public static final SimpleWeapon WRENCH = new SimpleWeapon("Wrench");
	
	public static final SimpleRoom KITCHEN = new SimpleRoom("Kitchen");
	public static final SimpleRoom BALLROOM = new SimpleRoom("Ballroom");
	public static final SimpleRoom CONSERV = new SimpleRoom("Conservatory");
	public static final SimpleRoom DINING = new SimpleRoom("Dining Room");
	public static final SimpleRoom BILLIARD = new SimpleRoom("Billiard Room");
	public static final SimpleRoom LIBRARY = new SimpleRoom("Library");
	public static final SimpleRoom LOUNGE = new SimpleRoom("Lounge");
	public static final SimpleRoom HALL = new SimpleRoom("Hall");
	public static final SimpleRoom STUDY = new SimpleRoom("Study");
	
	public static final List<SimpleSuspect> SUSPECTS = new ArrayList<SimpleSuspect>() {{
		add(SCARLET);
		add(MUSTARD);
		add(WHITE);
		add(GREEN);
		add(PEACOCK);
		add(PLUM);
	}};
	
	public static final List<SimpleWeapon> WEAPONS = new ArrayList<SimpleWeapon>() {{
		add(CANDLESTICK);
		add(KNIFE);
		add(PIPE);
		add(REVOLVER);
		add(ROPE);
		add(WRENCH);
	}};
	
	public static final List<SimpleRoom> ROOMS = new ArrayList<SimpleRoom>() {{
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
