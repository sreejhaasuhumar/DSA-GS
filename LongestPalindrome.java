package GS;

import java.util.HashSet;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abccccdd";
		 int a=longestPalindrome(s);
		 System.out.println(a);
	}
	
	public static int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
}

}
