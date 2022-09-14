package com.tejal;

import java.util.LinkedHashSet;
import java.util.Set;

public class GitMyProject {
	public static void main(String[] args) {
    String str="Hello";
    char[]arr=str.toCharArray();
    Set<Character>data=new LinkedHashSet<Character>();
    for(int i=0;i<arr.length;i++)
    {
    	data.add(arr[i]);
    }
    System.out.println(data);
	}

}
