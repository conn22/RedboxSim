package redbox;

public class Game extends Product {

	private String esrbRating;
	
	public Game(String t, String d, String r) {
		super(t, d);
		type = 1;
		esrbRating = r;
	}
	
	public String getRating() {
		return esrbRating;
	}
	
}
