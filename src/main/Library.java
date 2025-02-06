package main;

public class Library {
	//book dibuat array
	private Book[] books;
	private int numBooks;
	
	public Library() {
		//buat size penyimpanan buku
		books = new Book[100];
		numBooks = 0;
	}
	
	
	public void addBook(Book book) {
		if(numBooks < books.length) {
			books[numBooks++] = book;
		}
		else {
			System.out.println("Library penuhh");
		}
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		System.out.println(borrower.getNama() + "borrowed: " + book.getJudul());
	}
	
	public void returnBook(Borrower borrower, Book book){
		System.out.println(borrower.getNama() + "returned: " + book.getJudul());
	}
	
	public void displayLibraryBooks(){
		System.out.println("Library Books:");
		for(int i=0; i<numBooks; i++) {
			System.out.println("Title: " + books[i].getJudul());
			System.out.println("ISBN: " + books[i].getIsbn());
			System.out.println("Author: " + books[i].getAuthor.getNama());
			System.out.println("Biography: " + books[i].getAuthor.getBiografi());
		}
	}
}
