package chapter1;

public class PallindromePermutation {

	public static void main(String[] args) {
		String input = "nope";
		
		System.out.println(input +" has palindrome:" + checkIfPallindrome(input.toLowerCase()));
	}

	public static boolean checkIfPallindrome(String s){
		boolean isOdd = false;
		int[] charArray = new int[256];
		
		for(char c : s.toCharArray()){
			if(c != ' ') charArray[c]++;
		}
		for(int i =0; i < charArray.length; i++){
			if( charArray[i] % 2 == 0 ){
				continue;
			}
			else {
				if(!isOdd) isOdd = true;
				else return false;
			}
		}
		
		return true;
	}
}
