package redbox;

public class Product {
	
	private String title;
	private String desc;
	protected int type;
	
	public Product(String t, String d) {
		title = t;
		desc = d;
		type = -1;
	}
	
	public boolean equals(Product p) {
		return this.title.equals(p.getTitle()) && (this.type == p.getType());
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return desc;
	}
	
	public int getType() {
		return type;
	}
	
	public String getRating() {
		return "";
	}
	
//	public static void main(String[] args) {
//		Movie m = new Movie("Revenge of the Sith", "Because of Obi-wan", "PG-13");
//		Game g = new Game("Skyrim", "Now for 47 different consoles!", "M");
//		
//		System.out.println(m.getTitle());
//		System.out.println(m.getDescription());
//		System.out.println(m.getRating() + "\n");
//		
//		System.out.println(g.getTitle());
//		System.out.println(g.getDescription());
//		System.out.println(g.getRating() + "\n");
//		
//		System.out.println(m.getType());
//		System.out.println(g.getType());
//	}
	
}
