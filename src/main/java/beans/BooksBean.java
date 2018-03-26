package main.java.beans;

import javax.faces.bean.ManagedBean;

import main.java.BooksMain;
import main.java.models.Books;

@ManagedBean
public class BooksBean {
	
	private int id;
	private String nameBook;
	private String avtor;
	private String year;
	private String genre;
	private String discription;
	
	
	public BooksBean() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameBook() {
		return nameBook;
	}


	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}


	public String getAvtor() {
		return avtor;
	}


	public void setAvtor(String avtor) {
		this.avtor = avtor;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getDiscription() {
		return discription;
	}


	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	public String addBook (Books nameBook, Books avtor, Books year, Books genre, Books discription){
		return BooksMain.createNewBook(nameBook.getNameBook(), avtor.getAvtors(), year.getYear(), genre.getGenre(), discription.getDescription());
		
	}

}
