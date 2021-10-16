package GS;

public class MinimumAddToMakeParanthesisValid {

	public static void main(String[] args) {
       String s="(()())(()";
       int a=minAddToMakeValid(s);
       System.out.println(a);
	}
	
    public static int minAddToMakeValid(String s) {
    	//TC-O(n)
    	//SC-O(1)
        int left=0;
        int right=0;
        for(char c:s.toCharArray())
        {
        	if(c=='(')
        	{
        		left++;
        	}
        	else if(left>0)
        	{
        		left--;
        	}
        	else
        	{
        		right++;
        	}
        }
        
        return left+right;
        
    }

}
