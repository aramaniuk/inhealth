package com.vsk.gurutech.service;

import com.vsk.gurutech.model.TrackerData;

public class BaseServiceImpl implements BaseService {

    public String getData() {
        TrackerData td1 = new TrackerData(1, 123123213L, 12333);
        return TrackerData.getJson(td1);
    }
}
