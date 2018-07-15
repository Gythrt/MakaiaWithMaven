package week3.day1;

public class LearnPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Testleaf(9876) has no of employees 20";
		//System.out.println(text.replaceAll("[a-zA-Z]",""));

//Only numbers
		/*String pattern = "\\D";
		String replaceAll = text.replaceAll("\\D","");
		String replaceAll2 = replaceAll.replaceAll("\\W", "");
		System.out.println(replaceAll2);
		System.out.println(replaceAll2.substring(0, 2));

		String[] split = replaceAll2.split("" , 3);
		String value = "";
		int i=0;
		for(String eachValue : split) {
			value+=eachValue;
			i++;
		}
		System.out.println(value);
*/
		 

//Only Characters
	/*	String pattern = "\\d";
		String replaceAll = text.replaceAll("\\d","");
		String replaceAll2 = replaceAll.replaceAll("\\W", "");
		System.out.println(replaceAll2);
		System.out.println(replaceAll2.substring(0, 2));*/
		
//only special Character (incomplete - complete it)
		String pattern = "\\d";
		String replaceAll = text.replaceAll("\\d","");
		String replaceAll2 = replaceAll.replaceAll("\\W", "");
		System.out.println(replaceAll2);
		System.out.println(replaceAll2.substring(0, 2));
	
	}

}