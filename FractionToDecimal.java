package GS;

import java.util.HashMap;

public class FractionToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator = 4, denominator = 33;
		String s=fractionToDecimal(numerator, denominator);
		System.out.println(s);

	}
	
	public static String fractionToDecimal(int numerator, int denominator) {
	    StringBuilder result = new StringBuilder();
	    String sign = (numerator < 0 == denominator < 0 || numerator == 0) ? "" : "-";
	    long num = Math.abs((long) numerator);
	    long den = Math.abs((long) denominator);
	    result.append(sign);
	    result.append(num / den);
	    long remainder = num % den;
	    if (remainder == 0)
	        return result.toString();
	    result.append(".");
	    HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();
	    while (!hashMap.containsKey(remainder)) {
	        hashMap.put(remainder, result.length());
	        result.append(10 * remainder / den);
	        remainder = 10 * remainder % den;
	    }
	    int index = hashMap.get(remainder);
	    result.insert(index, "(");
	    result.append(")");
	    return result.toString().replace("(0)", "");
	}

}
