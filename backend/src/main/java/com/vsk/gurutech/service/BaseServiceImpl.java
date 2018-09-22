package com.vsk.gurutech.service;

import com.mongodb.MongoClient;
import com.vsk.gurutech.model.TrackerData;

import java.util.List;

public class BaseServiceImpl implements BaseService {

    private final MongoClient mongoClient;

    public BaseServiceImpl(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public String getData() {
        List<String> dbs = mongoClient.getDatabaseNames();
        for (String db : dbs) {
            System.out.println(db);
        }

        TrackerData td1 = new TrackerData(1, 123123213L, 12333);
        return TrackerData.getJson(td1);
    }
}
