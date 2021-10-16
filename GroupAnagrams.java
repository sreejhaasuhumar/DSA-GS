package GS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams2(strs);
	}

    public static List<List<String>> groupAnagrams(String[] strs) {
    	Map<String,ArrayList<String>> map=new HashMap<>();
         for(String s:strs)
         {
        	 char[] ch=s.toCharArray();
        	 Arrays.sort(ch);
        	 String str=String.valueOf(ch);
        	 if(!map.containsKey(str))
        	 {
        		map.put(str, new ArrayList<String>()) ;
        		map.get(str).add(s);
        	 }
        	 else
        	 {
        		 map.get(str).add(s);
        	 }
         }
         
         return new ArrayList<>(map.values());

    }
    
    public static  List<List<String>> groupAnagrams2(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
