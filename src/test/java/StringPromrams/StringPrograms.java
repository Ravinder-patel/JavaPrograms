package StringPromrams;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPrograms {
	/*
	 * 1. WAP to find the length of a given String or count the no. of characters
	 * present in a given String ?
	 */
	@Test
	public void lenthOfString() {
		String s = "Ravinder";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println("No.of charecters in string is : " + count);

	}

	@Test
	public void lenthOfString2() {
		String s = "Ravinder";
		System.out.println("No.of charecters in string is : " + s.length());

	}

	/* 2. WAP to print the vowels and consonants in a given String */
	@Test
	public void printVowelsAndConsonants() {
		String s = "Ravinder";
		String vowels = "";
		String consonants = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'U') {

				vowels += s.charAt(i);// System.out.println(s.charAt(i));

			} else {
				consonants += s.charAt(i);
			}
		}
		System.out.println("vowels : " + vowels);
		System.out.println("consonants : " + consonants);

	}

	@Test
	public void printVowelsAndConsonants2() {
		String s = "RavindEr";
		String vowels = "";
		String consonants = "";
		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				vowels += s.charAt(i);
				break;

			default:
				consonants += s.charAt(i);
				break;
			}

		}
		System.out.println("vowels : " + vowels);
		System.out.println("consonants : " + consonants);

	}

	@Test
	public void printVowelsAndConsonants3() {
		String s = "RavindEr";
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < vowels.length(); i++) {
			for (int j = 0; j < s.length(); j++) {

				if (vowels.charAt(i) == s.charAt(j)) {
					System.out.print(vowels.charAt(i));
					break;
				} else {
					System.out.print(s.charAt(j));
				}
			}

		}

	}

	/* 3. WAP to replace all the vowels in a given String with white space */
	@Test
	public void replaceVowelsWithSpace() {
		String s = "welcome to aplpha";
		String space = " ";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				s2 += space;
				break;

			default:
				s2 += s.charAt(i);
				break;
			}

		}
		System.out.println(s2);

	}

	@Test
	public void replaceVowelsWithSpace2() {
		String s1 = "Nagender208";
		String s2 = "AEIOUaeiou";
		String str = s1.replaceAll("[^A-Za-z]", "");
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (s2.contains(ch + "")) {
					str = str.replace(ch, '_');
				}
			}
		}
		System.out.println(str);

	}

	@Test
	public void replaceVowelsWithSpace3() {
		String name = "Ravinder patel 123@#$%^";
		String vowelString = "AEIOUaeiou";
		String resName = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (vowelString.contains(ch + "")) {
					resName = resName + " ";
				} else {
					resName = resName + ch;
				}

			}
		}
		System.out.println(resName);

	}

	/* 4. WAP to count the no. of spaces present in a given String */
	@Test
	public void countSpaces() {
		String s = "spaces present in a given String";
		int count = 0;
		char space = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == space) {
				count++;
			}

		}
		System.out.println("No of spaces in givenn string is : " + count);

	}

	@Test
	public void countSpaces2() {
		String s = "spaces present in a given String";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isWhitespace(ch)) {
				count++;
			}

		}
		System.out.println("No of spaces in givenn string is : " + count);

	}

	/* 5. WAP to reverse a String */
	@Test
	public void reverseString() {
		String s = "Ravinder";

		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i) + " ");

		}

	}

	@Test
	public void reverseString2() {
		String s = "Ravinder";
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i) + temp;

		}
		System.out.println(temp);

	}

	@Test
	public void reverseString3() {
		String s = "Ravinder";

		StringBuilder rev = new StringBuilder(s);
		System.out.println(rev.reverse().toString());
	}

	/* 6. WAP to check whether the given the String is Palindrome or not */
	@Test
	public void polindromeString() {
		String s = "cat";
		String s1 = s.toLowerCase();
		String temp = "";

		for (int i = 0; i < s1.length(); i++) {
			temp = s1.charAt(i) + temp;

		}
		if (s1.equals(temp)) {
			System.out.println("Given String " + s1 + " is a palindrome");

		} else {
			System.out.println("Given String " + s1 + " is not a palindrome");
		}

	}

	@Test
	public void polindromeString2() {
		String s = "mom";

		StringBuilder s1 = new StringBuilder(s);
		String reverse = s1.reverse().toString(); // we have to convert string builder into string to compare

		if (s.equals(reverse)) {
			System.out.println("Given String " + s + " is a palindrome");

		} else {
			System.out.println("Given String " + s + " is not a palindrome");
		}

	}

	/* 7. WAP to remove the duplicates from the given String */
	@Test
	public void removeDuplicates() {

		String str = "raaaavvvvii";
		String s = str.toLowerCase();
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j <= i; j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}

			}
			if (count == 1) {

				temp = temp + s.charAt(i);
			}

		}
		System.out.println(temp);

	}

	@Test
	public void removeDuplicates2() {

		String name = "ravinder patel";
		char[] chars = name.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int count = 0;
			for (int j = 0; j < chars.length; j++) {
				if (name.charAt(i) == name.charAt(j) && i < j) {
					break;
				} else if (name.charAt(i) == name.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				name = name.replace(name.charAt(i), ' ');
			}
		}
		System.out.println(name);

	}

	@Test
	public void removeDuplicates3() {

		String name = "ravinder patel";
		String uniqName = "";
		char[] chars = name.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int count = 0;
			for (int j = 0; j < chars.length; j++) {
				if (name.charAt(i) == name.charAt(j) && i < j) {
					break;
				} else if (name.charAt(i) == name.charAt(j)) {
					count++;
				}
			}
			if (count <= 1) {
				uniqName += name.charAt(i);
			}
		}
		System.out.println(uniqName);

	}

	/*
	 * 8.1 WAP to find the frequency of character in a given String
	 * 
	 */
	@Test
	public void frequencyCharacter() {

		String str = "Raamaam";
		String s = str.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j) && i > j) {
					break;
				} else if (s.charAt(i) == s.charAt(j)) {
					count++;

				}

			}
			if (count >= 1) {
				System.out.println("Charecter : " + s.charAt(i) + " Occurence is : " + count);

			}

		}
	}

	/*
	 * 8.1 WAP to find the max frequency of character in a given String
	 * 
	 */
	@Test
	public void maxFrequencyCharacter() {

		String str = "Raamaam";
		String s = str.toLowerCase();

		int maxCount = 0;
		char maxFreqChar = 0;

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j <= i; j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}

			}
			if (count > maxCount) {

				maxCount = count;
				maxFreqChar = s.charAt(i);
			}

		}
		System.out.println("max frequent charecter is: " + maxFreqChar + ": occurence is :" + maxCount);

	}

	/*
	 * 9. WAP to convert the given String into lower case
	 */

	@Test
	public void toLowerCase() {
		String s = "Ravinder is a GOOD boY";

		System.out.println(s.toLowerCase());

	}

	@Test
	public void toLowerCase2() {
		String name = "RavinDeR patel 1234";
		String lowerCase = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch >= 65 && ch <= 90) {
				lowerCase += ((char) (ch + 32));
			} else {
				lowerCase += ch;
			}
		}

		System.out.println(lowerCase);

	}

	/*
	 * 10. WAP to convert the given String into Upper case
	 */

	@Test
	public void toUpperCase() {
		String s = "Ramu is a GOOD boY";

		System.out.println(s.toUpperCase());

	}

	@Test
	public void toUpperCase2() {
		String name = "RavinDeR patel 1234";
		String upperCase = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch >= 97 && ch <= 122) {
				upperCase += ((char) (ch - 32));
			} else {
				upperCase += ch;
			}
		}

		System.out.println(upperCase);

	}

	/* 11. WAP to find the largest word in a given String */
	@Test
	public void largestWordInString() {
		String s = "Ram is a GOOD programmer ";

		String[] word = s.split(" ");
		String largestWord = word[0];

		for (int i = 0; i < word.length; i++) {
			if (largestWord.length() < word[i].length()) {
				largestWord = word[i];

			}

		}

		System.out.println("Largest word is : " + largestWord);

	}

	@Test
	public void largestWordInString2() {
		String name = "RavinDeR patel purella234567";
		String[] words = name.split(" ");
		String largestWord = "";

		for (String word : words) {
			if (word.length() > largestWord.length()) {
				largestWord = word;
			}

		}
		System.out.println(largestWord);

	}

	/* 12. WAP to find the smallest word in a given String */
	@Test
	public void smallestWordInString() {
		String s = "Ram is a GOOD programmer ";

		String[] word = s.split(" ");
		String smallestWord = word[0];

		for (int i = 0; i < word.length; i++) {
			if (smallestWord.length() > word[i].length()) {
				smallestWord = word[i];

			}

		}

		System.out.println("Largest word is : " + smallestWord);

	}

	/* 13. WAP to remove the white spaces from a given String */
	@Test
	public void removeWhiteSpaces() {
		String s = "Ramu is a GOOD boY";
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isWhitespace(ch)) {

			} else {
				temp = temp + s.charAt(i);
			}

		}

		System.out.println(temp);

	}

	@Test
	public void removeWhiteSpaces2() {
		String s = "Ramu is a GOOD boY";
		String[] split = s.split(" ");

		System.out.println(String.join("", split));

	}

	@Test
	public void removeWhiteSpaces3() {
		String s = "Ramu is a GOOD boY";
		System.out.println(s.replaceAll(" ", ""));

	}

	@Test
	public void removeWhiteSpaces4() {
		String name = "RavinDeR patel purella";
		String appendName = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isWhitespace(ch)) {
//				appendName = appendName + "";
			} else {
				appendName += ch;
			}
		}

		System.out.println(appendName);

	}

	/* 14. WAP to swap the first and last word in a given String */
	@Test
	public void swapFirstAndLast() {
		String s = "boy is a good Ramu";
		String[] words = s.split(" ");
		String temp = words[0];
		words[0] = words[words.length - 1];
		words[words.length - 1] = temp;

		String join = String.join(" ", words); // join method is used to join the words

		System.out.println(join);

	}

	/*
	 * 15. WAP to reverse the words in a given String without reversing the words
	 * themselves
	 */
	@Test
	public void reverseTheWords() {
		String s = "Hello world wellcome to my program";
		String[] words = s.split(" ");

		String reverseWords = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reverseWords = reverseWords + words[i] + " ";

		}
		System.out.println(reverseWords);

	}

	@Test
	public void reverseTheWords2() {
		System.out.println("Enter A Name : ");
		String name = new Scanner(System.in).nextLine();

		String[] arrNames = name.split(" ");
		String reverse = "";
		for (String word : arrNames) {
			reverse = " " + word + reverse;
		}
		System.out.println(reverse);
		System.out.println(reverse.trim());
	}

	/*
	 * 16. WAP to reverse each and every word in a given String without reversing
	 * the string ?
	 */
	@Test
	public void reverseEachAndEveryWord() {
		String s = "welcome to my program";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {

			String temp = words[i];
			String revWord = "";

			for (int j = 0; j < temp.length(); j++) {
				revWord = temp.charAt(j) + revWord;

			}

			words[i] = revWord;

		}
		String join = String.join(" ", words);
		System.out.println(join);
	}

	/* 17. WAP to find the frequency of each and every word in a given String */
	@Test
	public void freqyencyOfWords() {

		String s = "mom dad mom";
		String[] words = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			int count = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j]) && i > j) {
					break;

				} else if (words[i].equals(words[j])) {
					count++;

				}
			}
			if (count >= 1) {
				System.out.println("Word : " + words[i] + ": Occurence : " + count);
			}

		}

	}

	/* 18. WAP to check the given word is present inside a given String or not */
	@Test
	public void verifyWordInsideString() {
		String word = "GOOD";
		String s = "Ramu is a GOOD boY";
		if (s.contains(word)) {
			System.out.println("given word : " + word + "\n is perent inside given String: " + s);

		} else {
			System.out.println("given word : " + word + "\n is not perent inside given String: " + s);
		}

	}

	/* 19. WAP to check whether the given String is Anagram or not */
	@Test
	public void anagramString() {
		String s1 = "act";
		String s2 = "cat";
		if (s1.length() == s2.length()) {
			char[] s11 = s1.toCharArray();
			char[] s22 = s2.toCharArray();
			Arrays.sort(s11);
			Arrays.sort(s22);
			if (Arrays.toString(s11).equals(Arrays.toString(s22))) {
				System.out.println("It is an Anagram");
			} else {
				System.out.println("not Anagram");
			}

		} else {
			System.out.println("not Anagram");
		}

	}
	@Test
	public void anagramString2() {
		String s1 = "act";
		String s2 = "cat";
		if (s1.length() == s2.length()) {
			char[] s11 = s1.toCharArray();
			char[] s22 = s2.toCharArray();
			Arrays.sort(s11);
			Arrays.sort(s22);
			if (Arrays.equals(s11, s22)) {
				System.out.println("It is an Anagram");
			} else {
				System.out.println("not Anagram");
			}

		} else {
			System.out.println("not Anagram");
		}

	}

	/* 20. WAP to find the substring of a given String */
	@Test
	public void substringOfString() {
		String s = "welcome to my world";
		String subString = "my";
		if (s.contains(subString)) {
			System.out.println("Given sub string :" + subString + "=== is in : " + s);

		}

	}

	/*
	 * 21. WAP to compare two strings lexicographically. (Two strings are
	 * lexicographically equal if they are the same length and contain the same
	 * characters in the same positions)
	 */
	@Test
	public void lexicographicalStrings() {
		String s1 = "Hi";
		String s2 = "Hello";

		int a = s1.compareTo(s2);

		if (a < 0) {
			System.out.println("Given String " + s1 + " is lexicographically smaller");

		} else if (a > 0) {
			System.out.println("Given String " + s1 + " is lexicographically greater");
		} else {
			System.out.println("Given String " + s1 + " and " + s2 + " are lexicographically equal");
		}

	}

	/* 22. WAP to replace a specified character with another character. */
	@Test
	public void replaceCharecter() {
		String s = "Ramo ram";
		String str = s.replace('o', 'c');
		System.out.println(str);
		System.out.println(s.replaceAll("am", "cm"));

	}

	/* 23. WAP to find the longest Palindromic Substring within a string. */
	@Test
	public void lasrgestPalindrome() {
		String s = "om dad level racecar deed";
		String[] words = s.split(" ");
		String lp = "";

		for (String str : words) {
			StringBuffer sb = new StringBuffer(str.toLowerCase());
			String reversedStr = sb.reverse().toString();
			if (reversedStr.equals(str) && str.length() > lp.length()) {
				lp = str;
			}

		}

		System.out.println("Largest palindrome word is : " + lp);

	}

	@Test
	public void largestPalindrome2() {
		String s = "om dad level racecar deed";
		String lowStr = s.toLowerCase();
		String[] words = lowStr.split(" ");
		String lp = "";

		for (int j = 0; j < words.length; j++) {
			String next = words[j];
			String rev = "";

			for (int i = 0; i < next.length(); i++) {
				rev = next.charAt(i) + rev;

			}
			words[j] = rev;

			if (words[j].equals(next)) {

				if (words[j].length() > lp.length()) {
					lp = words[j];

				}

			}

		}

		System.out.println("Largest palindrome word is : " + lp);

	}

	/* 23.1 WAP to find the smallest palindromic Substring within a string. */
	@Test
	public void smallestPalindrome() {
		String s = "a is deed dad level racecar mom".toLowerCase();
		String[] words = s.split(" ");
		String sp = null;

		for (String str : words) {
			String reversedStr = new StringBuffer(str).reverse().toString();

			if (reversedStr.equals(str)) {
				sp = reversedStr;
				break;
			}
		}
		for (String str : words) {
			String reversedStr = new StringBuffer(str).reverse().toString();

			if (reversedStr.equals(str) && str.length() < sp.length()) {
				sp = str;
			}

		}

		System.out.println("Smallest palindrome word is : " + sp);

	}

	/* 23.2 WAP to find the smallest palindromic Substring within a string. */
	@Test
	public void smallestPalindrome2() {
		String s = "is deeD Dad level raCecar mom";
		String[] words = s.split(" ");
		String sp = null;

		for (String str : words) {

			String reversedStr = new StringBuffer(str).reverse().toString();

			if (reversedStr.equalsIgnoreCase(str)) {
				sp = reversedStr;
				break;
			}
		}
		for (String str : words) {
			String reversedStr = new StringBuffer(str).reverse().toString();

			if (reversedStr.equalsIgnoreCase(str) && str.length() < sp.length()) {
				sp = str;
			}

		}

		System.out.println("Smallest palindrome word is : " + sp);

	}

	/* 23.2 WAP to find the smallest palindromic Substring within a string. */
	@Test
	public void smallestPalindrome3() {
		String s = "is deed dad level racecar mom".toLowerCase();
		String[] words = s.split(" ");
		String smallestPalindrome = null;

		for (String str : words) {
			String reversedStr = new StringBuffer(str).reverse().toString();
			if (reversedStr.equals(str)) {
				if (smallestPalindrome == null || str.length() < smallestPalindrome.length()) {
					smallestPalindrome = str;
				}
			}
		}

		System.out.println("Smallest palindrome word is : " + smallestPalindrome);
	}

	@Test
	public void duplicateVowels() {
		String str = "iNAgaRajI";
		String s = str.toLowerCase();
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < s.length(); i++) {
			if (vowels.contains(s.charAt(i) + "")) {
				int count = 0;
				for (int j = 0; j < s.length(); j++) {

					if (s.charAt(i) == s.charAt(j) && i > j) {
						break;
					} else if (s.charAt(i) == s.charAt(j)) {
						count++;

					}

				}
				if (count > 1) {
					System.out.println("Charecter : " + s.charAt(i) + " Occurence is : " + count);

				}
			}
		}
	}

	@Test
	public void duplicateVowels2() {
		String str = "ravinder PATEL";
		String s = str.toLowerCase();
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < vowels.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {

				if (vowels.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("Vowel : " + vowels.charAt(i) + " Occurence is : " + count);
			}
		}
	}

	// wap to reverse the alternative words in the given string?
	@Test
	public void reverseAlternativeWords() {
		String str = "life is beautiful journey";
		String[] words = str.split(" ");
		int k = 1;
		for (int i = 0; i < words.length; i += 2) {
			String temp = words[i];
			String rev = "";
			for (int j = 0; j < temp.length(); j++) {
				rev = temp.charAt(j) + rev;
			}

			System.out.print(rev + " " + words[k] + " ");
			k += 2;
		}
	}

	@Test
	public void reverseAlternativeWords2() {
		String str = "life is beautiful journey";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String temp = words[i];
			if (i % 2 == 0) {
				String rev = "";
				for (int j = 0; j < temp.length(); j++) {
					rev = temp.charAt(j) + rev;
				}
				System.out.print(rev + " ");
			} else {
				System.out.print(temp + " ");
			}
		}
		System.out.println();
	}

	@Test
	public void reverseAlternativeWords3() {
		String str = "life is beautiful journey";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
		}
		System.out.println(String.join(" ", words));
	}
}
