package GS;

public class UniformSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abbbccda";
		int[] a=uniformSubstring(s);
		System.out.println(a);
	}
	
	public static int[] uniformSubstring(String s)
	{
		int index=-1;
		int length=0;
		char ch[]=s.toCharArray();
		int i=0,j=1;
		int count=0;
		while(j<s.length())
		{
			if(ch[i]==ch[j])
			{
				count++;
				if(count>length)
					index=i;
			}
			else
			{
				i=j;
				count=0;
			}
			j++;
			length=Math.max(length,count);

		}
		
		return new int[] {index,length+1};
	}
	

}
