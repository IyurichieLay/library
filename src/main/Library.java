package main;

import java.util.ArrayList;

public class Library {
	//book dibuat array
	//add book
//	private Book[] books;
//	private int numBooks;
//	
//	public Library() {
//		//buat size penyimpanan buku
//		books = new Book[100];
//		numBooks = 0;
//	}
//	
//	public void addBook(Book book) {
//		if(numBooks < books.length) {
//			books[numBooks++] = book;
//		}
//		else {
//			System.out.println("Library penuhh");
//		}
//	}
	
	private ArrayList<Book> books;
	
	public Library() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
//	public Book searchBook(String isbn) {
//		for(int i=0; i<numBooks; i++) {
//			if(books[i].getJudul())
//		}
//		for(Book book : books) {
//			if(book.getIsbn().equals((isbn)){
//				return book;
//			}
//		}
//		return null;
//	}
		
	public void borrowBook(Borrower borrower, Book book) {
		if(books.contains(book) && !book.isBorrowed()) {
			book.borrowBook();
			borrower.addBorrowedBook(book);
			System.out.println(borrower.getNama() + "borrowed: " + book.getJudul());
		}
		else {
			System.out.println("Book not available");
		}
	}
	
	public void returnBook(Borrower borrower, Book book){
		if(books.contains(book) && book.isBorrowed()) {
			borrower.removeBorrowedBook(book);
			book.returnBook();
			System.out.println(borrower.getNama() + "returned: " + book.getJudul());
		}
		
	}
	
	public void displayLibraryBooks(){
		System.out.println("Library Books:");
		for(Book book : books) {
			System.out.println("Title: " + book.getJudul());
			System.out.println("ISBN: " + book.getIsbn());
			System.out.println("Author: " + book.getAuthor().getNama());
			System.out.println("Biography: " + book.getAuthor().getBiografi());
		}
	}
}
