package player;

import misc.NamedObject;

public interface Player extends NamedObject {
	
	public static final Player CASE_FILE = new SimplePlayer("Case file");
	public static final Player ME = new SimplePlayer("Me");

}
