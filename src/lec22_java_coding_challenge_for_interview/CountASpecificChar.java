package lec22_java_coding_challenge_for_interview;

// Q: Count how many 'a' is present in the string "aabba'

public class CountASpecificChar {
	

	public static void main(String[] args) {
		String s = "aabbacdaaswaeiou";
		int count = 0;
//mistake happen in if condition
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
