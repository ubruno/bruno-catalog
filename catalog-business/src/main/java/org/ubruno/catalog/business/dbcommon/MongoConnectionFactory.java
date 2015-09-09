package org.ubruno.catalog.business.dbcommon;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

public class MongoConnectionFactory {

	public static MongoClient mongoClient;

	public static MongoDatabase getConnection() {
		if (mongoClient == null) {
			mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
		}
		MongoDatabase md = mongoClient.getDatabase("catalog");
		return md;
	}

	public static void closeConnection(){
		mongoClient.close();
		mongoClient = null;
	}
}
