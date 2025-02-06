package main;

public class Borrower {
	private String nama;
	
	public Borrrower(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void displayBorrowedBooks() {
		System.out.println(nama + "'s Borrowed Books:");
	}
}
