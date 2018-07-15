package grid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnString {

/*	private static final Object[] String = null;
	private static final int Character = 0;*/

	public static void main(String[] args) {

		/*String myName="Gayathri";
		char[] charArray = myName.toCharArray();*/

		/*for (char c : charArray) {
			System.out.println(c);

		}*/

		//Reverse a String method 1
		/*int length = myName.length();
		for(int i=length-1; i>=0;i--) {
			System.out.println(charArray[i]);

		}*/

		//Reverse a String method 2
		/*int length = myName.length();
		for(int i=length-1; i>=0;i--) {
			System.out.println(myName.charAt(i));
		}*/

		//Reverse a String using StringBuilder
		/*StringBuilder build = new StringBuilder("Gayathri");
		StringBuilder reverse = build.reverse();
		System.out.println(reverse);*/


		//to get the hashcode value
		/*int hashCode = myName.hashCode();
		System.out.println(hashCode);
		myName="Saranya";
		System.out.println(myName.hashCode());*/

//Using Set - Method 1 (HashSet)
		//Using hashset - Random order
		/*String comp ="google";
		Set<Character> uniquechar = new HashSet<Character>();
		char[] charArray = comp.toCharArray();

		for (char c : charArray) {
			uniquechar.add(c);
		}
		System.out.println(uniquechar);
*/

//Using Set - Method 2 (TreeSet)
		//Using TreeSet - ASCII order
		/*String comp ="google";
		Set<Character> uniquechar = new TreeSet<Character>();
		char[] charArray = comp.toCharArray();

		for (char c : charArray) {
			uniquechar.add(c);
		}
		System.out.println(uniquechar);
*/
		
//Using Set - Method 3(LinkedHashSet)
		//Using LinkedHashSet - Insert order (Correct order)
		/*String comp ="google";
		Set<Character> uniquechar = new LinkedHashSet<Character>();
		char[] charArray = comp.toCharArray();

		for (char c : charArray) {
			uniquechar.add(c);
		}
		System.out.println(uniquechar);*/
		
		
//Using List
		
		String comp ="google";
		List<Character> list = new ArrayList<Character>();
		char[] charArray = comp.toCharArray();

		for (char c : charArray) {
			if(!list.contains(c)) {
				list.add(c);
			}
		}
		System.out.println(list);
		
		}
		
	}


