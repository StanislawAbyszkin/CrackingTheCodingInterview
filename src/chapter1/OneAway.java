package chapter1;

public class OneAway {

	public static void main(String[] args) {
		String s1 = "ate";
		String s2 = "mate";

		// System.out.println(removeCharacter(s1, s2) || addCharacter(s1, s2));
		System.out.println(replaceCharacter(s1, s2));
	}

	public static boolean removeCharacter(String s1, String s2) {
		String longer, shorter;
		if (s1.length() > s2.length()) {
			longer = s1;
			shorter = s2;
		} else {
			longer = s2;
			shorter = s1;
		}

		for (int i = 0; i < longer.length(); i++) {
			StringBuilder sb = new StringBuilder(longer);
			sb.deleteCharAt(i);
			if (sb.toString().equals(shorter))
				return true;
		}

		return false;
	}

	public static boolean replaceCharacter(String s1, String s2) {
		if(s1.equals(s2)) return true;
		
		if (s1.length() != s2.length())
			return removeCharacter(s1, s2);
		else {

			boolean toReturn = false;
			boolean modifiedOnce = false;

			for (int i = 0; i < s1.length(); i++) {
				StringBuilder sb1 = new StringBuilder(s1);
				StringBuilder sb2 = new StringBuilder(s2);
				if (sb1.charAt(i) != sb2.charAt(i)) {
					sb1.replace(i, i + 1, String.valueOf(sb2.charAt(i)));
					if (sb1.toString().equals(sb2.toString())) {
						toReturn = true;
						if (!modifiedOnce)
							modifiedOnce = true;
						else
							return false;
					}
				}
			}
			return toReturn;
		}
	}
}
