package com.indus.training.persist.impl;

import java.net.UnknownHostException;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class TestMongoConnection {

	public static void main(String[] args) {
		try {
			MongoClient mongo = new MongoClient("localhost", 27017);
			List<String> dbs = mongo.getDatabaseNames();
			System.out.println(dbs);
			DB db = mongo.getDB("mydbtwo");
			DBCollection col = db.getCollection("studentcollection");
			System.out.println(db);
			System.out.println(col.count());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
