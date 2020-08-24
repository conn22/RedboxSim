package redbox;

import java.util.ArrayList;

public class Redbox {
	
	private ArrayList<Product> inventory;
	private ArrayList<Integer> available;
	private ArrayList<Integer> maxCopies;
	private int maxSpace;
	private int usedSpace;
	
	public Redbox(int max) {
		inventory = new ArrayList<Product>();
		available = new ArrayList<Integer>();
		maxCopies = new ArrayList<Integer>();
		maxSpace = max;
		usedSpace = 0;
	}
	
	public Redbox() {
		inventory = new ArrayList<Product>();
		available = new ArrayList<Integer>();
		maxCopies = new ArrayList<Integer>();
		maxSpace = 100;
		usedSpace = 0;
	}
	
	public boolean addProduct(Product p, int q) {
		
		if(q <= 0) {
			return false;
		}
		
		if(usedSpace+q > maxSpace) {
			return false;
		}
		
		if(inventory.contains(p)) {
			int pos = getPosOfProd(p);
			available.set(pos, available.get(pos) + q);
			maxCopies.set(pos, maxCopies.get(pos) + q);
			return true;
		}
		
		else {
			inventory.add(p);
			available.add(q);
			maxCopies.add(q);
			usedSpace = usedSpace + q;
			return true;
		}
		
	}
	
	private int getPosOfProd(Product p) {
		for(int i = 0; i < inventory.size(); i++) {
			if(p.equals(inventory.get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	public Product getItemAt(int pos) {
		return inventory.get(pos);
	}
	
	public boolean checkoutProduct(Product p, int q) {
		if(q <= 0) {
			return false;
		}
		int pos = getPosOfProd(p);
		if (pos == -1) {
			return false;
		}
		else {
			if(q <= available.get(pos)) {
				available.set(pos, available.get(pos) - q);
				return true;
			}
			return false;
		}
	}
	
	public boolean returnProduct(Product p, int q) {
		if(q <= 0) {
			return false;
		}
		int pos = getPosOfProd(p);
		if (pos == -1) {
			return false;
		}
		else {
			if(q <= maxCopies.get(pos) - available.get(pos)) {
				available.set(pos, available.get(pos) + q);
				return true;
			}
		}
		return false;
	}

	
	public void printInv() {
		for(int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i).getTitle() + "\t" + available.get(i) + "\t" + maxCopies.get(i));
		}
	}
	
	/*
	public static void main(String[] args) {
		Redbox redbox = new Redbox(100);
		Product p1 = new Product("Rat Movie 2", "");
		Product p2 = new Product("IT", "");
		Product p3 = new Product("Halo 3", "");
		Product p4 = new Product("Pirates of the Caribbean", "");
		Product p5 = new Product("Skyrim", "");
		Product p6 = new Product("Harry Potter", "");
		
		redbox.addProduct(p1, 5);
		redbox.addProduct(p2, 5);
		redbox.addProduct(p3, 5);
		redbox.addProduct(p4, 5);
		redbox.addProduct(p5, 5);
		redbox.addProduct(p6, 5);
		
		redbox.printInv();
		
		redbox.checkoutProduct(p1, 2);
		
		redbox.printInv();
		
		redbox.returnProduct(p1,  2);
		
		redbox.printInv();
		
		
	}
	*/
	
}
