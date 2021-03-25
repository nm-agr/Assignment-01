package com.nagarro.ds;

import java.util.*;

public class hashMapDemo {

	public static void main(String[] args) {
		int[] nums = {3,2,3};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0) + 1);
        }
        //System.out.print(map);
        
        int n = nums.length / 2;
        int ans = 0 ;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        	//System.out.println(entry.getKey()+ " " + entry.getValue());
        	if(entry.getValue() > n){
                ans = entry.getKey();
                break;
            }
        }
        System.out.println(ans);
        

	}

}
