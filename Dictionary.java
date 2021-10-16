package GS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] words = {"a","banana","app","appl","ap","apply","apple"};
		 String s=longestWord(words);
		 System.out.println(s);

	}
	
	public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<String>();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                built.add(w);
            }
        }
        return res;
    }

}
