package GS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "cbaebabacd", p = "abc";
		List<Integer> list=findAnagrams(s, p);
		System.out.println(list);
		
	}
	
    public static List<Integer> findAnagrams(String s, String p) {

   	 int[] letters = new int[26];
     for(int i = 0; i < p.length(); i++) {
         letters[p.charAt(i) - 'a']++;
     }
     int j = 0;
     int rem = p.length();
     List<Integer> result = new ArrayList();
     for(int i = 0; i < s.length(); i++) {
         while(j < s.length() && j - i < p.length()) {
             if(letters[s.charAt(j++) - 'a']-- > 0) {
                 rem--;
             }
         }
         if(rem == 0 && j - i == p.length()) result.add(i);
         if(letters[s.charAt(i) - 'a']++ >= 0) rem++;
     }
     return result;
    }

}
