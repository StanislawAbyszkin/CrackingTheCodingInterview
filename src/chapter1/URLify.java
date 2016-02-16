package chapter1;

public class URLify {

	public static void main(String[] args) {
		String stringToModify = "Mr John Smith";
		int numberOfChars = 13;
		
		System.out.println(stringToModify + " " +  numberOfChars);
		System.out.println(replaceSpaces(stringToModify));
	}
	
	public static String replaceSpaces(String s){
		
		StringBuilder strBuilder = new StringBuilder();
		for(char c:s.toCharArray()){
			if (c == ' ')
				strBuilder.append("%20");
			else
				strBuilder.append(c);		
		}
		return strBuilder.toString();
	}

}
