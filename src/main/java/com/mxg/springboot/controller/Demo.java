package com.mxg.springboot.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"aa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        Set<Map.Entry<Integer,String>> entrys=map.entrySet();
        Iterator<Map.Entry<Integer,String>> it=entrys.iterator();
        while(it.hasNext()){
           Map.Entry<Integer,String> entry =it.next();
           String value=entry.getValue();
           int key=entry.getKey();
            System.out.println(value+"========"+key);
        }
    }

}
