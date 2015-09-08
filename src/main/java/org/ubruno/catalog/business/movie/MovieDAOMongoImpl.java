package org.ubruno.catalog.business.movie;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.ubruno.catalog.business.dbcommon.MongoConnectionFactory;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

public class MovieDAOMongoImpl implements MovieDAO {

	private MongoCollection<Document> dbCollection;

	public MovieDAOMongoImpl() {
		this.dbCollection = MongoConnectionFactory.getConnection().getCollection("movies");
	}
	
	
	@Override
	public List<MovieVO> findAll() {
		
		List<MovieVO> movies = new ArrayList<MovieVO>();
		
		FindIterable<Document> documents = dbCollection.find();
		
		for (Document document : documents) {
			MovieVO movie = new MovieVO();
			movie.setId(document.getObjectId("_id").toHexString());
			movie.setTitle(document.getString("title"));
			movie.setGenre(document.getString("genre"));
			movie.setReleaseDate(document.getString("releaseDate"));
			movie.setYear(document.getDouble("year"));
			movies.add(movie);
		}
		return movies;
	}

	@Override
	public MovieVO findOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieVO insert(MovieVO model) {
		// TODO Auto-generated method stub
		return null;
	}

}
