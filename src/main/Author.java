package main;

public class Author {
	//private biar gabisa diganti2
	private String nama;
	private String biografi;
	
	public Author(String nama, String biografi) {
		this.nama = nama;
		this.biografi = biografi;
	}
	
	public String getNama() {
		return nama;
	}
	public String getBiografi() {
		return biografi;
	}
}
