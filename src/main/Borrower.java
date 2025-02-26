package main;

import java.util.ArrayList;

public class Borrower {
	private String nama;
	private ArrayList<Book> borrowedBooks;
//	private List<Book> borrowedBooks = new ArrayList<>();
	
	public Borrower(String nama) {
		this.nama = nama;
		this.borrowedBooks = new ArrayList<>();
	}
	
	public void displayBorrowedBooks() {
		System.out.println(nama + "'s Borrowed Books:");
		if(borrowedBooks.isEmpty()) {
			System.out.println("No books borrowed");
		}
		else {
			for(Book book : borrowedBooks) {
				System.out.println(book.getJudul());
			}
		}
//		borrowedBooks.add(book.getJudul())
	}
	
	public void addBorrowedBook(Book book) {
		borrowedBooks.add(book);
	}
	
	public void removeBorrowedBook(Book book) {
		borrowedBooks.remove(book);
	}
	
	public String getNama() {
		return nama;
	} 
	
	
}
