package GS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HighFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] items = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		int[][] ans=highFive(items);
		System.out.println(ans.toString());
	}

	public static int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int[] item : items){
            int id = item[0];
            int score = item[1];
            
            if(!map.containsKey(id)){
                map.put(id, new PriorityQueue<>());
                map.get(id).add(score);
            }
            else{
                map.get(id).add(score);
                if(map.get(id).size() > 5)
                    map.get(id).poll();
            }
        }
        
        int i = 0;
        int[][] res = new int[map.size()][2];
        for(int id : map.keySet()){
            res[i][0] = id;
            int sum = 0;
            for(int e : map.get(id))
                sum += e;
            res[i][1] = sum / 5;
            i++;
        }
        
        return res;
    }
}
