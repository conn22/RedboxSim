package redbox;

public class Movie extends Product {
	
	private String caraRating;
	
	public Movie(String t, String d, String r) {
		super(t, d);
		type = 0;
		caraRating = r;
	}
	
	public String getRating() {
		return caraRating;
	}
	
}
