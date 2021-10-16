package GS;

public class BestTimeToBuySellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {3,2,6,5,0,3};
		int ans=maxProfit(prices);
		System.out.println(ans);
		}

	
	
	 public static int maxProfit(int[] prices) {
		 int n = prices.length;
	      int diff = 0,i=0;    
	      while(i<n-1)
	      {
	          if(prices[i+1]>prices[i]){
	              diff = diff+(prices[i+1]-prices[i]);
	          }
	          i++;
	      }
	      return diff;
	    }
	 
	

}
