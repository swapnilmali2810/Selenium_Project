package com.etlhive.www.Selenium_Project;

import java.util.HashMap;
import java.util.Map;

public class HashMapCharCount {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		String S = "I am learning Java";
		String Str = S.toLowerCase();
		char [] ch = Str.toCharArray();
		int vowel = 0;
		int consonent = 0;
		HashMap <Character, Integer> hm = new HashMap <Character, Integer> ();
		
		for (char c : ch) {
			
			if (hm.containsKey(c)) {
				
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		hm.remove(' ');
		for (Map.Entry<Character, Integer> m: hm.entrySet()) {
			
			if (m.getKey() =='a'|| m.getKey() == 'e' || m.getKey() ==  'i' || m.getKey() =='o' || m.getKey() == 'u') {
				vowel = vowel + m.getValue();
			}else {
				
				consonent = consonent + m.getValue();
			}
			
		}
		
		System.out.println ("total no. of vowels " +vowel);
		System.out.println ("total no. of consonent " +consonent);

	}
		
}

