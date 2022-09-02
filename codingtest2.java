package test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class codingtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(stages.length);
		int N = 5;
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        for(int i=1; i<=N; i++){
        	
            int rate=0;
            int failNum=0;
            for(int j=0; j<stages.length; j++){
                if(stages[j]>=i){
                	rate +=1;
                	if(stages[j]==i) {
                		failNum +=1;
                	}
                }
            }
            map.put(i,(double)failNum/(double)rate);
            
        }
        System.out.println(map);
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        for(Integer key : keySet) {
            System.out.println("key : " + key + " , " + "value : " + map.get(key));
        }
        
        System.out.println(keySet);
	}
}
