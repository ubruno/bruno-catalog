package org.ubruno.catalog.tests;

import org.ubruno.catalog.business.movie.MovieDAO;
import org.ubruno.catalog.business.movie.MovieDAOMongoImpl;

public class MovieDAOTest {

	public MovieDAOTest() {
	}

	public static void main(String[] args) {
		
		MovieDAO dao = new MovieDAOMongoImpl();
		
		dao.findAll().forEach(m -> System.out.println(m.getTitle()));
		
		
	}
	
	
}
