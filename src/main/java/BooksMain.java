package main.java;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.models.Books;


public class BooksMain {

			
		public static String createNewBook(String nameBook, String avtor, String year, String genre, String discription){
			
			EntityManager entityManager = Persistence.createEntityManagerFactory("Books").createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
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
		return "Librar?faces-redirect=true";
		}
		
		@SuppressWarnings("unchecked")
		public static  List<Books> getAllBook () {
			EntityManager entityManager = Persistence.createEntityManagerFactory("Books").createEntityManager();
			Query query = entityManager.createQuery("SELECT s FROM Books s");
			List<Books> bookList = query.getResultList();
			if (bookList!=null && bookList.size()>0) return bookList;
			else return null;
		}

		

		
	
}
