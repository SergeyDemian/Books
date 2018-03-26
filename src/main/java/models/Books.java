package main.java.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (
		name = "BOOKS"
		)
public class Books extends Model implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(
			name = "NAMEBOOK",
			nullable = false
			)
	private String nameBook;
	
	@Column(
			name = "AVTORS",
			nullable = true
			)
	private String avtors;
	
	@Column(
			name = "YEAR",
			nullable = false
			)
	private String year;
	
	@Column(
			name = "GENRE",
			nullable = false
			)
	private String genre;
	
	@Column(
			name = "DISCRIPTION",
			nullable = true
			)
	private String description;

	public Books() {
		super();
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getAvtors() {
		return avtors;
	}

	public void setAvtors(String avtors) {
		this.avtors = avtors;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year2) {
		this.year = year2;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
