package GS;

public class MinimumSubArraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 11;
		int[] nums = {1,2,3,4,5};
		int ans=minSubArrayLen(target,nums);
		System.out.println(ans);
	}

	 public static int minSubArrayLen(int s, int[] a) {
		 if(a.length==0 || a==null)
			 return 0;
		 int i=0,j=0,sum=0,count=Integer.MAX_VALUE;
		 while(j<a.length)
		 {
			 sum=sum+a[j];
			 j++;
			 if(sum>=s)
			 {
			    count=Math.min(count,j-i);
			    i++;
			    j=i;
			    sum=0;
			 }
		 }
		 return count!=Integer.MAX_VALUE?count:0;
	 }
	 
	 public int minSubArrayLen2(int s, int[] a) {
		  if (a == null || a.length == 0)
		    return 0;
		  
		  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
		  
		  while (j < a.length) {
		    sum += a[j++];
		    
		    while (sum >= s) {
		      min = Math.min(min, j - i);
		      sum -= a[i++];
		    }
		  }
		  
		  return min == Integer.MAX_VALUE ? 0 : min;
		}
}
