package game;

public class SimpleGame implements Game {
	
	private GameState state;
	private GameInfo info;
	
	public SimpleGame(GameState state, GameInfo info) {
		this.state = state;
		this.info = info;
	}

	@Override
	public GameState getState() {
		return state;
	}

	@Override
	public GameInfo getInfo() {
		return info;
	}

}
