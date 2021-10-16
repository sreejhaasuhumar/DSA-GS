package GS;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "anagram";
		String t = "nagaram";
		boolean b=isAnagram2(s,t);
		System.out.println(b);
	}
	
	public static boolean isAnagram(String s, String t) {
		//tc-O(nlogn)__bcoz of sort-merge sort
        if(s.length()!=t.length())
            return false;
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        s=String.valueOf(ss);
        t=String.valueOf(tt);
        if (s.equalsIgnoreCase(t))
        	return true;
        else 
        	return false;
    }
	
	 public static boolean isAnagram2(String s, String t) {
	        int[] alphabet = new int[26];
	        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
	        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
	        for (int i : alphabet) if (i != 0) return false;
	        return true;
	    }

}
