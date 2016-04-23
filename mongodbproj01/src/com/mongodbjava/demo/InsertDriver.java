package com.mongodbjava.demo;

import java.net.UnknownHostException;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document; 


public class InsertDriver {
	
	public MongoDatabase getMongoDatabase() {
		return mongoDatabase;
	}


	public void setMongoDatabase(MongoDatabase mongoDatabase) {
		this.mongoDatabase = mongoDatabase;
	}


	public MongoClient getMongoClient() {
		return mongoClient;
	}


	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	MongoDatabase mongoDatabase;
	MongoClient mongoClient;
	
	public static void main(String[] args) throws UnknownHostException
	{
		
		InsertDriver insertDriver = new InsertDriver();
		
		MongoDatabase mongoDatabase = insertDriver.getDatabase("mongodemo");
		
		mongoDatabase.createCollection("Channel");
		
		MongoCollection<Document> collection  = mongoDatabase.getCollection("Channel");
		
		  // drop all the data in it
       // collection.drop();
		
        // make a document and insert it
        Document doc = new Document("name", "MongoDB")
                       .append("type", "database")
                       .append("count", 1)
                       .append("info", new Document("x", 203).append("y", 102));

        collection.insertOne(doc);
		
        // get it (since it's the only one in there since we dropped the rest earlier on)
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
		
        insertDriver.getMongoClient().close();

	}
	
	
	public MongoDatabase getDatabase(String database)
	{
	 mongoClient = new MongoClient( "localhost" , 12345);

		//MongoDatabase mongoDatabase = (new MongoClient("localhost", 12345)).getDatabase("srirampdemo");
		
		MongoDatabase mongoDatabase = mongoClient.getDatabase("database");
		
		return mongoDatabase;
		
	}
	
	public void closeClient(MongoClient mongoClient)
	{
		mongoClient.close();
	}
	
	
}
