package main;

public class Book {
	private String judul;
	private String isbn;
	private Author author;
	private Boolean isBorrowed;
	
	public Book(String judul, String isbn, Author author) {
		this.judul = judul;
		this.isbn = isbn;
		this.author = author;
		this.isBorrowed = false;
	}
	
	public String getJudul() {
		return judul;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void borrowBook() {
		isBorrowed = true;
	}
	
	public Boolean isBorrowed() { //utk cek kondisi di borrowBook dan returnBook
		return isBorrowed;
	}
	
	public void returnBook() {
		isBorrowed = false;
	}
}
