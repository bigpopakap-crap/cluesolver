package card;

import java.util.Arrays;
import java.util.List;

//TODO JAVA8: add default getType() method
public interface Suspect extends Card {
	
	public static final Suspect SCARLET = new SimpleSuspect("Miss Scarlet");
	public static final Suspect MUSTARD = new SimpleSuspect("Colonel Mustard");
	public static final Suspect WHITE = new SimpleSuspect("Mrs. White");
	public static final Suspect GREEN = new SimpleSuspect("Mr. Green");
	public static final Suspect PEACOCK = new SimpleSuspect("Mrs. Peacock");
	public static final Suspect PLUM = new SimpleSuspect("Prof. Plum");
	
	public static final List<Suspect> ALL_STANDARD = Arrays.asList(
		SCARLET, MUSTARD, WHITE, GREEN, PEACOCK, PLUM
	);

}
