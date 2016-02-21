package chapter1;

public class StringRotation {
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println(isStringRotated(s1, s2));
	}
	
	public static boolean isStringRotated(String s1, String s2)
	{
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s1);
		return sb.toString().contains(s2);
	}
}
