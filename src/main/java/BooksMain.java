package main.java;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.models.Books;


public class BooksMain {

	private static EntityManager entityManager = Persistence.createEntityManagerFactory("Books").createEntityManager();
	private static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
		
		public static String createNewBook(String nameBook, String avtor, String year, String genre, String discription){
			System.out.println(BooksMain.class);
			
			try {
				entityTransaction.begin();
				Books books = new Books();
				books.setNameBook(nameBook);
				books.setAvtors(avtor);
				books.setGenre(genre);
				books.setYear(year);
				books.setDescription(discription);
				entityManager.persist(books);
				entityTransaction.commit();
			} catch (Exception e) {
				entityTransaction.rollback();
			} finally {
				entityManager.close();
			}
		return "/Librar.xhtml?faces-redirect=true";
		}

		

		
	
}
