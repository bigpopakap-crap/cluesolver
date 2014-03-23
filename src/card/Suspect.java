package card;

import java.util.ArrayList;
import java.util.List;

//TODO JAVA8: add default getType() method
public interface Suspect extends Card {
	
	public static final Suspect SCARLET = new SimpleSuspect("Miss Scarlet");
	public static final Suspect MUSTARD = new SimpleSuspect("Colonel Mustard");
	public static final Suspect WHITE = new SimpleSuspect("Mrs. White");
	public static final Suspect GREEN = new SimpleSuspect("Mr. Green");
	public static final Suspect PEACOCK = new SimpleSuspect("Mrs. Peacock");
	public static final Suspect PLUM = new SimpleSuspect("Prof. Plum");
	
	@SuppressWarnings("serial")
	public static final List<Suspect> SUSPECTS = new ArrayList<Suspect>() {{
		add(SCARLET);
		add(MUSTARD);
		add(WHITE);
		add(GREEN);
		add(PEACOCK);
		add(PLUM);
	}};

}
