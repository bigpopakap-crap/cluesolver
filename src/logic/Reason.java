package logic;

public enum Reason {
	HORIZONTAL_UNIQUENESS("Somebody else has this card"),
	HORIZONTAL_UNIQUENESS_INVERSE("Nobody else has this card")
	;
	
	private String message;
	
	private Reason(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
