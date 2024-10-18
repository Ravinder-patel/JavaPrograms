package StringPromrams;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;
import org.testng.annotations.Test;

public class RegexPrograms {
	@Test
	public void StringProb() {
		String s = "$9#7A"; // A16
		String num = s.replaceAll("[^0-9]", ""); // "^" means except those
		String chars = s.replaceAll("[^A-Z]", "");

		int sum = 0;
		for (int i = 0; i < num.length(); i++) {

			sum += (int) Character.getNumericValue(num.charAt(i));

		}
		System.out.print(chars + sum);

	}

	@Test
	public void StringProb2() {
		String s = "$#28!&33AB#C"; // 33 28 AB C
		String[] num = s.split("[^0-9]");
		String[] chars = s.split("[^A-Z]");

		for (int i = num.length - 1; i >= 0; i--) {

			if (num[i] != "") {
				System.out.print(num[i] + " ");
			}

		}
		for (int i = 0; i < chars.length; i++) {

			if (chars[i] != "") {
				System.out.print(chars[i] + " ");
			}

		}

	}

	@Test
	public void StringProb3() {
		String s = "I Love java";
		String str = s.replaceAll(" ", "");
		int rev = str.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.print(s.charAt(i));
			} else {
				System.out.print(str.charAt(rev--));
			}

		}
		System.out.println();

	}

	@Test
	public void StringProb51() {

		String s = "aaabbc";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j] && i > j) {
					break;
				} else if (c[i] == c[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(c[i] + "" + count);
			}
		}

	}

	@Test
	public void StringProb52() {

		String s = "aaabbcddddd"; // a3b2c1d5
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(s.charAt(i) + "" + count);
				count = 1;
			}

		}
		System.out.print(s.charAt(s.length() - 1) + "" + count);

	}

	@Test
	public void StringProb41() {
		String s = "a3b3c2"; // aaabbbcc
		String s2 = "";
		for (int i = 0; i < s.length(); i = i + 2) {
			String temp = "";
			int next = (int) s.charAt(i + 1) - 48;
			// System.out.print(next);
			for (int j = 0; j < next; j++) {
				temp = temp + s.charAt(i);
			}
			s2 = s2 + temp;
		}
		System.out.print(s2);

	}

	@Test
	public void StringProb42() {
		String s = "a3b3c2";
		for (int i = 0; i < s.length(); i = i + 2) {
			int next = Character.getNumericValue(s.charAt(i + 1));

			for (int j = 0; j < next; j++) {
				System.out.print(s.charAt(i));
			}

		}
		System.out.println();

	}

	@Test
	public void StringProb43() {
		String s = "a3b3c2";
		for (int i = 0; i < s.length(); i = i + 2) {
			int next = Character.getNumericValue(s.charAt(i + 1));
			String d = "" + s.charAt(i);
			System.out.print(d.repeat(next));
		}
		System.out.println();

	}

	@Test
	public void regX_Problem1() {
		String expression = "11+10";
		String numbers = expression.replaceAll("[/+*\\-]", " ");
		String[] strArray = numbers.split(" ");
		int sum = 0;
		for (int i = 0; i < strArray.length; i++) {
			int digits = Integer.parseInt(strArray[i]);
			sum += digits;
		}
		System.out.println(sum);
	}

	@Test
	public void regX_Problem2() { // wrong===use JEXL Dependency
		String expression = "11+10-5*2/1";
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		if (engine != null) {
			try {
				Object result = engine.eval(expression);
				System.out.println("The result of the expression is: " + result);
			} catch (ScriptException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("JavaScript engine not found. Please check your JDK installation.");
		}
	}

	@Test
	public void regX_Problem3() {
		String expression = "11 + 10 - 3 * 10 / 18";
		String[] strArray = expression.split(" ");
		int result = Integer.parseInt(strArray[0]);
		// System.out.println(result);

		for (int i = 1; i < strArray.length; i += 2) {
			String operator = strArray[i];
			int nextNumber = Integer.parseInt(strArray[i + 1]);

			switch (operator) {
			case "+":
				result += nextNumber;
				break;
			case "-":
				result -= nextNumber;
				break;
			case "*":
				result *= nextNumber;
				break;
			case "/":
				result /= nextNumber;
				break;
			default:
				System.out.println("Invalid operator: " + operator);
				return;
			}
		}

		System.out.println("The result of the expression is: " + result);

	}

	@Test
	public void regexProblem4() {
		String expression = "11+10-2*10/5";
		JexlEngine jexl = new JexlBuilder().create();
		JexlExpression jexlExp = jexl.createExpression(expression);
		JexlContext context = new MapContext();
		Object result = jexlExp.evaluate(context);
		System.out.println("The result of the expression is: " + result);
	}

	/* WAJP to print only the alphabets in the given string */
	@Test
	public void aphabetsInString1() {

		String s = "ra$v9iArt#7i"; // raviArti

		String chars = s.replaceAll("[^A-Za-z]", "");// "^" means except those remaining are removed
		System.out.println(chars);

	}

	@Test
	public void aphabetsInString2() {

		String s = "Ra$v9iArt∞↓#"; // raviArti
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				res += s.charAt(i);

			}
		}

		if (res.isEmpty()) {
			System.out.println("No alphabets in thye string");
		} else {
			System.out.println(res);
		}

	}
}
