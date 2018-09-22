package com.vsk.gurutech.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrackerData {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    public Integer sId;
    public Long date;
    public Integer steps;

    public TrackerData(Integer sId, Long date, Integer steps) {
        this.sId = sId;
        this.date = date;
        this.steps = steps;
    }

    public static String getJson(TrackerData o) {
        String data = "Some Error";
        try {
            data = objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }

}
