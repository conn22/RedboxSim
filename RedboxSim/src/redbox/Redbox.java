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
	
	public boolean addProduct() {
		return true;
	}
	
	public Product getItemAt(int pos) {
		return null;
	}
	
	public boolean checkoutProduct() {
		return true;
	}
	
	public boolean returnProduct() {
		return true;
	}
	
	public void printInv() {
		
	}
	
}
