package logic;

public enum Reason {
	USER_ENTERED("User entered this value"),
	SOMEBODY_ELSE_HAS_CARD("Somebody else has this card"),
	NOBODY_ELSE_HAS_CARD("Nobody else has this card")
	;
	
	private String message;
	
	private Reason(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
