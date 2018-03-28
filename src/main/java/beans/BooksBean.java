package main.java.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import main.java.BooksMain;

@ManagedBean(name = "booksBean", eager = true)
@RequestScoped
public class BooksBean {
	
	
	private String nameBook;
	private String avtor;
	private String year;
	private String genre;
	private String discription;
	

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
	
	public String addBook(BooksBean booksBean){
		
		return BooksMain.createNewBook(booksBean.getNameBook(),
				booksBean.getAvtor(), booksBean.getYear(), booksBean.getGenre(), booksBean.getDiscription());
		
	}

}
