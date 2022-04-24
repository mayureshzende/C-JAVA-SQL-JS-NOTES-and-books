package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentEmail {
	 Map<String, String> hashMap = new HashMap<String, String>();

	    public  void addStudentEmailId(String key, String value){

	        if(isValidEmailId(value)) {

	            hashMap.put(key, value);

	        }

	    }

	    public String getStuddentEmailId(Object key){

	        if (!(key instanceof String)) {

	            throw new IllegalArgumentException("Object not type of String");

	        }

	        return hashMap.get(key);

	    }

	    public boolean isValidEmailId(String email){

	        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

	        Pattern pattern = Pattern.compile(regex);

	        Matcher m = pattern.matcher(email);

	        return m.matches();

	    }


}
