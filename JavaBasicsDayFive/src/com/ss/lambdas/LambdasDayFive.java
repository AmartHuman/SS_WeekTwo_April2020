/**
 * 
 */
package com.ss.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Alfred
 *
 */
public class LambdasDayFive {

	public static String helperMethod(String s1, String s2) {

		return " ";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] lamb = { "Sony", "Microsoft","GlideFx", "A", "CC", "Nvida", "AMD", "Voodoo", "DrictX", "Vulkan",
				"everRex", "eDRam", "DDR", "GDDR", "RICS", "IBM", "CPU", "GPU", "end" };

		System.out.println("• length (i.e., shortest to longest)");
		Arrays.sort(lamb, (s1, s2) -> s1.length() - s2.length());
		Arrays.stream(lamb).forEach(s -> System.out.print(s + ", "));

		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("• reverse length (i.e., longest to shortest)");
		Arrays.sort(lamb, (s1, s2) -> s1.length() - s2.length());
		Arrays.stream(lamb).forEach(s -> System.out.print(s + ", "));

		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("• alphabetically by the first character only");
		System.out.println(Arrays.stream(lamb).filter(Objects::nonNull)
				.map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)).sorted().collect(Collectors.toList()));

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("• Strings that contain “e” first, everything else second");

		Arrays.sort(lamb, (s1, s2) -> {
			
			Integer isE = 0;
			if (s1.charAt(0) == 'e' &&  s2.charAt(0) != 'e') {
				isE = -1;
			} else if (s2.charAt(0) == 'e' &&  s1.charAt(0) != 'e') {
				isE = 1;
			}
			return (isE);
			
		});
		Arrays.stream(lamb).forEach(s->System.out.print(s + ", "));
		
		
		
		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("• Redo the previous problem, but use a static helper method so that your lambda looks like this:");
		
		String[] lambHelper = { "waste", "endof", "e", "kind", "what", "time", "silver", "mario", "luigi",
				"eradicate", "egg", "epilog", "readme", "take", "never", "ontop", "lite", "end" };
		Arrays.sort(lambHelper,(s1, s2) -> Utils.helper(s1, s2));
		Arrays.stream(lambHelper).forEach(s->System.out.print(s + ", "));
		


		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("2. Task two Even or Odd");
		Integer[] evenOdd = { 34, 56, 123, 2, 1, 3, 4, 67756, 234, 89 };

		Arrays.stream(evenOdd).forEach((i) -> {
			if (i % 2 == 0) {
				System.out.print("e" + i + ", ");
			} else {
				System.out.print("o" + i + ", ");
			}
		});

		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println(
				"3. Given a list of Strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters");

		List<String> stringList = new ArrayList<>();
		stringList = Arrays.asList("ark", "apple", "never", "lite", "make", "dog", "ape", "a", "aaa", "sit",
				"adsflkasjdfl", "and", "ant", "anteater", "antlop");
		System.out.println(stringList.stream().filter(s -> s.charAt(0) == 'a').filter(s -> s.length() == 3)
				.collect(Collectors.toList()));

	}

}
