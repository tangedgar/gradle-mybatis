package com.tanghui04.utils;

import java.util.UUID;

public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
}