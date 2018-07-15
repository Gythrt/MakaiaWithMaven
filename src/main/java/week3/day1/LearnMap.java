package week3.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company="Amazon";
		company = company.toLowerCase();
		System.out.println(company);
		char[] charArray = company.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for (char eachChar : charArray) {
			System.out.println(eachChar);
			if(map.containsKey(eachChar)) {
			map.put(eachChar, map.get(eachChar)+1);
			}else {
				map.put(eachChar, 1);
			}
		}
		
		//System.out.println("The most recurring value is" +map.get());


	}

}
