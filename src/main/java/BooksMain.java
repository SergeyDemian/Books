package main.java;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.models.Books;


public class BooksMain {

	public static void main(String [] args) {
		
		Books books = new Books();
		books.setNameBook("First Book");
		books.setAvtors("Terrie");
		books.setGenre("Fantastic");
		books.setYear(2011);
		books.setDescription("whatsss");
		
		EntityManagerFactory entytyManFac = Persistence.createEntityManagerFactory("Books");
		EntityManager entityManager = entytyManFac.createEntityManager();
		
		
		try {
			entityManager.getTransaction().begin();
			
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
			entytyManFac.close();
		}
	}
}
