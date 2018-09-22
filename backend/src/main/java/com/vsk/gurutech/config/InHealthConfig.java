package com.vsk.gurutech.config;

import com.mongodb.MongoClient;
import com.vsk.gurutech.service.BaseService;
import com.vsk.gurutech.service.BaseServiceImpl;

import java.net.UnknownHostException;
import java.util.EmptyStackException;

public class InHealthConfig {

    public static BaseService getBaseService() {
        return new BaseServiceImpl(getMongo());
    }

    public static MongoClient getMongo() {
        try {
            return new MongoClient("localhost", 27017);
        } catch (UnknownHostException e) {
            throw new EmptyStackException();
        }
    }

}
