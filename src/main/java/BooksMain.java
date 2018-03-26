package main.java;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import main.java.models.Books;


public class BooksMain {

		
		static EntityManager entityManager = Persistence.createEntityManagerFactory("Books").createEntityManager();
		
		
		public static String createNewBook(String nameBook, String avtor, int year, String genre, String discription){
			try {
				entityManager.getTransaction().begin();
				Books books = new Books();
				books.setNameBook(nameBook);
				books.setAvtors(avtor);
				books.setGenre(genre);
				books.setYear(year);
				books.setDescription(discription);
				entityManager.persist(books);
				entityManager.getTransaction().commit();
			} catch (Exception e) {
				entityManager.getTransaction().rollback();
			} finally {
				entityManager.close();
			}
		return " ";
		}
		

		
	
}
