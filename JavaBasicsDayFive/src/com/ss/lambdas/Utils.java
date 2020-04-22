/**
 * 
 */
package com.ss.lambdas;


/**
 * @author Alfred
 *
 */
public class Utils{
	
	public static Integer helper(String s1, String s2) {
		
		Integer isE = 0;
		if (s1.charAt(0) == 'e' &&  s2.charAt(0) != 'e') {
			isE = -1;
		} else if (s2.charAt(0) == 'e' &&  s1.charAt(0) != 'e') {
			isE = 1;
		}
		return (isE);
	}


}
