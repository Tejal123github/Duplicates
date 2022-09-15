package com.tejal;

import java.util.LinkedHashMap;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
    LinkedHashMap<String,String>map=new LinkedHashMap<String,String>();
    map.put("102","pune");
    map.put("104","Nashik");
    map.put("106","Delhi");
    Set<String> set=map.keySet();
    for(String str:set) {
    	System.out.println(str);
    	System.out.println(map.get(str));
    }

    
	}

}
