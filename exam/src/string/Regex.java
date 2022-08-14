package string;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".a", "ava"));
		System.out.println(Pattern.matches("[abc]", "java"));
	}
}
