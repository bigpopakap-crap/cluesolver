package card;

import java.util.ArrayList;
import java.util.List;

//TODO JAVA8: add default getType() method
public interface Weapon extends Card {
	
	public static final Weapon CANDLESTICK = new SimpleWeapon("Candlestick");
	public static final Weapon KNIFE = new SimpleWeapon("Knife");
	public static final Weapon PIPE = new SimpleWeapon("Lead Pipe");
	public static final Weapon REVOLVER = new SimpleWeapon("Revolver");
	public static final Weapon ROPE = new SimpleWeapon("Rope");
	public static final Weapon WRENCH = new SimpleWeapon("Wrench");
	
	@SuppressWarnings("serial")
	public static final List<Weapon> WEAPONS = new ArrayList<Weapon>() {{
		add(CANDLESTICK);
		add(KNIFE);
		add(PIPE);
		add(REVOLVER);
		add(ROPE);
		add(WRENCH);
	}};

}
