package com.vsk.gurutech.config;

import com.vsk.gurutech.service.BaseService;
import com.vsk.gurutech.service.BaseServiceImpl;

public class InHealthConfig {

    private final static BaseService baseService = new BaseServiceImpl();

    public static BaseService getBaseService() {
        return baseService;
    }



}
